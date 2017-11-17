package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class SubClass__IntentBuilder {

    private final RequiredSequence<ResolvedAllSet> rs0;

    public SubClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        rs0 = new RequiredSequence<>(bundle, allSet);
    }

    public SuperClass__IntentBuilder.RequiredSequence<ResolvedAllSet> t(String s) {
        return rs0.t(s);
    }

    public class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_REQUIRED_SET_STATE extends AllSet> extends RequiredStateSequence<ALL_REQUIRED_SET_STATE> {
        final SuperClass__IntentBuilder.RequiredSequence<ALL_REQUIRED_SET_STATE> parentRs;

        public RequiredSequence(Bundle bundle, ALL_REQUIRED_SET_STATE allRequiredSetState) {
            super(bundle, allRequiredSetState);
            parentRs = new SuperClass__IntentBuilder.RequiredSequence<>(bundle, allRequiredSetState);
        }

        public SuperClass__IntentBuilder.RequiredSequence<ALL_REQUIRED_SET_STATE> t(String t) {
            bundle.putString("t", t);
            return parentRs;
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
