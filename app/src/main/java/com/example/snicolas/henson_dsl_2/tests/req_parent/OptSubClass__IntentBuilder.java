package com.example.snicolas.henson_dsl_2.tests.req_parent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.Empty;
import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class OptSubClass__IntentBuilder {

    private final RequiredSequence<ResolvedAllSet> rs0;

    public OptSubClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        rs0 = new RequiredSequence<>(bundle, allSet);
    }

    //this will require some processing on the super class of the intent builder
    public ResolvedAllSet s(String s) {
        return rs0.s(s);
    }

    public static class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    //this class is only here for subclasses
    public static class RequiredSequence<ALL_SET extends AllSet>
            extends RequiredStateSequence<ALL_SET> implements Empty {

        final SuperClass__IntentBuilder.RequiredSequence<ALL_SET> parentRs;

        public RequiredSequence(Bundle bundle, ALL_SET allRequiredSetState) {
            super(bundle, allRequiredSetState);
            parentRs = new SuperClass__IntentBuilder.RequiredSequence<>(bundle, allRequiredSetState);
        }

        public ALL_SET s(String s) {
            return parentRs.s(s);
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
