package com.example.snicolas.henson_dsl_2.tests.both_parent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class ReqSubClass__IntentBuilder {

    private final RequiredSequence<ResolvedAllSet> rs0;

    public ReqSubClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        rs0 = new RequiredSequence<>(bundle, allSet);
    }

    public SuperClass__IntentBuilder.RequiredSequence<ResolvedAllSet> t(String s) {
        return rs0.t(s);
    }

    public static class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_SET extends AllSet>
            extends RequiredStateSequence<ALL_SET> {
        final SuperClass__IntentBuilder.RequiredSequence<ALL_SET> parentRs;

        public RequiredSequence(Bundle bundle, ALL_SET allRequiredSetState) {
            super(bundle, allRequiredSetState);
            parentRs = new SuperClass__IntentBuilder.RequiredSequence<>(bundle, allRequiredSetState);
        }

        public SuperClass__IntentBuilder.RequiredSequence<ALL_SET> t(String t) {
            bundle.putString("t", t);
            return parentRs;
        }
    }

    public static class AllSet<SELF extends AllSet<SELF>> extends SuperClass__IntentBuilder.AllSet<SELF> {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }
}
