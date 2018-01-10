package com.example.snicolas.henson_dsl_2.tests.opt_parent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;

public class ReqSubClass__IntentBuilder {

    public static InitialState getInitialState(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        return new InitialState(bundle, intent);
    }

    public static <ALL_SET extends AllSet> RequiredSequence<ALL_SET> getNextState(Bundle bundle, ALL_SET allSetState) {
        return new RequiredSequence<>(bundle, allSetState);
    }

    public static class InitialState extends RequiredSequence<ResolvedAllSet> {
        public InitialState(Bundle bundle, Intent intent) {
            super(bundle, new ResolvedAllSet(bundle, intent));
        }
    }

    public static class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_SET extends AllSet>
        extends RequiredStateSequence<ALL_SET> {

        public RequiredSequence(Bundle bundle, ALL_SET allRequiredSetState) {
            super(bundle, allRequiredSetState);
        }

        public ALL_SET t(String t) {
            bundle.putString("t", t);
            return SuperClass__IntentBuilder.getNextState(bundle, allRequiredSetState);
        }
    }

    public static class AllSet<SELF extends AllSet<SELF>> extends SuperClass__IntentBuilder.AllSet<SELF> {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }
}
