package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class SubSubClass__IntentBuilder {

    private final RequiredSequence<ResolvedAllSet> rs0;

    public SubSubClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        final SuperClass__IntentBuilder.RequiredSequence<ResolvedAllSet> rs2 = new SuperClass__IntentBuilder.RequiredSequence<>(bundle, allSet);
        final SubClass__IntentBuilder.RequiredSequence<ResolvedAllSet> rs1 = new SubClass__IntentBuilder.RequiredSequence<>(bundle, rs2);
        rs0 = new RequiredSequence<>(bundle, rs1);
    }

    public SubClass__IntentBuilder.RequiredSequence<ResolvedAllSet> u(String s) {
        return rs0.u(s);
    }

    public class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_REQUIRED_SET_STATE extends AllSet> extends RequiredStateSequence<SubClass__IntentBuilder.RequiredSequence<ALL_REQUIRED_SET_STATE>> {
        public RequiredSequence(Bundle bundle, SubClass__IntentBuilder.RequiredSequence<ALL_REQUIRED_SET_STATE> allRequiredSetState) {
            super(bundle, allRequiredSetState);
        }

        public SubClass__IntentBuilder.RequiredSequence<ALL_REQUIRED_SET_STATE> u(String u) {
            bundle.putString("u", u);
            return allRequiredSetState;
        }
    }

    public static class AllSet<SELF extends AllSet<SELF>> extends SubClass__IntentBuilder.AllSet<SELF> {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public SELF c(int c) {
            bundle.putInt("c", c);
            return (SELF) this;
        }
    }
}
