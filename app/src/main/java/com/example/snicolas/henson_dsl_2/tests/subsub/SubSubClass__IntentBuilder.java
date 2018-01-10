package com.example.snicolas.henson_dsl_2.tests.subsub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;
import com.example.snicolas.henson_dsl_2.tests.both_parent.BothSubClass__IntentBuilder;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class SubSubClass__IntentBuilder {


    private Context context;

    public SubSubClass__IntentBuilder(Context context) {
        this.context = context;
    }

    public RequiredSequence<ResolvedAllSet> getInitialState() {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        return new RequiredSequence<>(bundle, allSet);
    }

    public static <T extends AllSet> RequiredSequence<T> getInitialState(Bundle bundle, T allSetState) {
        return new RequiredSequence<>(bundle, allSetState);
    }

    public static class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_STATE extends AllSet> extends RequiredStateSequence<ALL_STATE> {

        public RequiredSequence(Bundle bundle, ALL_STATE allRequiredSetState) {
            super(bundle, allRequiredSetState);
        }

        public BothSubClass__IntentBuilder.RequiredSequence<ALL_STATE> u(String u) {
            bundle.putString("u", u);
            return BothSubClass__IntentBuilder.getNextState(bundle, allRequiredSetState);
        }
    }

    public static class AllSet<SELF extends AllSet<SELF>> extends BothSubClass__IntentBuilder.AllSet<SELF> {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public SELF c(int c) {
            bundle.putInt("c", c);
            return (SELF) this;
        }
    }
}
