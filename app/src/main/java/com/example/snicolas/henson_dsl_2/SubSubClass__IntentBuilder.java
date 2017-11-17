package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;


public class SubSubClass__IntentBuilder {

    private final SubSubClass__IntentBuilderRequiredSequence<SubClass__IntentBuilderRequiredSequence<SuperClass__IntentBuilderRequiredSequence<AllSet>>> rs0;

    public SubSubClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        final Bundle bundle = new Bundle();
        final AllSet allSet = new AllSet(bundle, intent);
        final SuperClass__IntentBuilderRequiredSequence<AllSet> rs2 = new SuperClass__IntentBuilderRequiredSequence<>(bundle, allSet);
        final SubClass__IntentBuilderRequiredSequence<SuperClass__IntentBuilderRequiredSequence<AllSet>> rs1 = new SubClass__IntentBuilderRequiredSequence<>(bundle, rs2);
        rs0 = new SubSubClass__IntentBuilderRequiredSequence<>(bundle, rs1);
    }

    public SubClass__IntentBuilderRequiredSequence<SuperClass__IntentBuilderRequiredSequence<AllSet>> u(String s) {
        return rs0.u(s);
    }

    public static class AllSet extends SuperClass__IntentBuilder.AllSet {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public AllSet c(int a) {
            bundle.putInt("c", a);
            return this;
        }
    }
}
