package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.ActivityClassFinder.getClassDynamically;


public class SubClass__IntentBuilder {

    private Bundle bundle = new Bundle();
    private Intent intent;

    private SubClass__IntentBuilderPart<SuperClass__IntentBuilderPart<SubClass__IntentBuilder.AllSet>> part;
    private SuperClass__IntentBuilderPart<SubClass__IntentBuilder.AllSet> superPart;

    public SubClass__IntentBuilder(Context context) {
        intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        SubClass__IntentBuilder.AllSet allSet = new SubClass__IntentBuilder.AllSet(bundle, intent);
        superPart = new SuperClass__IntentBuilderPart<>(bundle, allSet);
        part = new SubClass__IntentBuilderPart<>(bundle, superPart);
    }

    public SuperClass__IntentBuilderPart<SubClass__IntentBuilder.AllSet> t(String s) {
        return part.t(s);
    }

    public static class AllSet extends SuperClass__IntentBuilder.AllSet {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public AllSet b(int a ) {
            bundle.putInt("a", a);
            return this;
        }
    }
}
