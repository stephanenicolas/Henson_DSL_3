package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class SubClass__IntentBuilder {

    private final SubClass__IntentBuilderRequiredSequence<SuperClass__IntentBuilderRequiredSequence<AllSet>> rs0;

    public SubClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final AllSet allSet = new AllSet(bundle, intent);
        final SuperClass__IntentBuilderRequiredSequence<AllSet> rs1 = new SuperClass__IntentBuilderRequiredSequence<>(bundle, allSet);
        rs0 = new SubClass__IntentBuilderRequiredSequence<>(bundle, rs1);
    }

    public SuperClass__IntentBuilderRequiredSequence<AllSet> t(String s) {
        return rs0.t(s);
    }

    public static class AllSet extends SuperClass__IntentBuilder.AllSet {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public AllSet b(int a) {
            bundle.putInt("a", a);
            return this;
        }
    }
}
