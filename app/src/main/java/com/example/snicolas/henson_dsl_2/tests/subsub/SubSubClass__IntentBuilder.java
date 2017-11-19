package com.example.snicolas.henson_dsl_2.tests.subsub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;
import com.example.snicolas.henson_dsl_2.tests.both_parent.BothSubClass__IntentBuilder;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class SubSubClass__IntentBuilder {

    private final RequiredSequence<ResolvedAllSet> rs0;

    public SubSubClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        rs0 = new RequiredSequence<>(bundle, allSet);
    }

    public BothSubClass__IntentBuilder.RequiredSequence<ResolvedAllSet> u(String s) {
        return rs0.u(s);
    }

    public static class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_STATE extends AllSet> extends RequiredStateSequence<ALL_STATE> {
        final BothSubClass__IntentBuilder.RequiredSequence<ALL_STATE> parentRs;

        public RequiredSequence(Bundle bundle, ALL_STATE allRequiredSetState) {
            super(bundle, allRequiredSetState);
            parentRs = new BothSubClass__IntentBuilder.RequiredSequence<>(bundle, allRequiredSetState);
        }

        public BothSubClass__IntentBuilder.RequiredSequence<ALL_STATE> u(String u) {
            bundle.putString("u", u);
            return parentRs;
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
