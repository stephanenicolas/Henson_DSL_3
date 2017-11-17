package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class SubClass__IntentBuilder {

    private Bundle bundle = new Bundle();

    private SubClass__IntentBuilderPart<SuperClass__IntentBuilderPart<SubClass__IntentBuilder.AllSet>> part;
    private SuperClass__IntentBuilderPart<SubClass__IntentBuilder.AllSet> superPart;

    public SubClass__IntentBuilder(Context context) {
        SubClass__IntentBuilder.AllSet allSet = new SubClass__IntentBuilder.AllSet(bundle);
        superPart = new SuperClass__IntentBuilderPart<>(context, allSet);
        part = new SubClass__IntentBuilderPart<>(context, superPart);
        allSet.setIntent(part.getIntent());
    }

    public SuperClass__IntentBuilderPart<SubClass__IntentBuilder.AllSet> t(String s) {
        return part.t(s);
    }

    public static class AllSet extends SuperClass__IntentBuilder.AllSet {
        public AllSet(Bundle bundle) {
            super(bundle);
        }

        public AllSet b(int a ) {
            bundle.putInt("a", a);
            return this;
        }
    }
}
