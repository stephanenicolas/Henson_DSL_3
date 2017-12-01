package com.example.snicolas.henson_dsl_2.tests.both_parent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class OptSubClass__IntentBuilder {

    public static SuperClass__IntentBuilder.RequiredSequence<ResolvedAllSet> getInitialState(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet resolvedAllSet = new ResolvedAllSet(bundle, intent);
        return SuperClass__IntentBuilder.getInitialState(bundle, resolvedAllSet);
    }

    public static <ALL_SET extends AllSet> SuperClass__IntentBuilder.RequiredSequence<ALL_SET> getInitialState(Bundle bundle, ALL_SET allSetState) {
        return SuperClass__IntentBuilder.getInitialState(bundle, allSetState);
    }

    public static class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class AllSet<SELF extends AllSet<SELF>> extends SuperClass__IntentBuilder.AllSet<SELF> {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public SELF b(int b) {
            bundle.putInt("b", b);
            return (SELF) this;
        }
    }
}
