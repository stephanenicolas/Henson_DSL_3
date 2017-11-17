package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.AllRequiredSetState;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;

public class SuperClass__IntentBuilder {

    private Bundle bundle = new Bundle();
    private SuperClass__IntentBuilderRequiredSequence<AllSet> rs0;
    private final Intent intent;

    public SuperClass__IntentBuilder(Context context) {
        intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
        AllSet allSet = new AllSet(bundle, intent);
        rs0 = new SuperClass__IntentBuilderRequiredSequence<>(bundle, allSet);
    }

    public SuperClass__IntentBuilder.AllSet s(String s) {
        return rs0.s(s);
    }

    public static class AllSet extends AllRequiredSetState {

        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public AllSet a(int a) {
            bundle.putInt("a", a);
            return this;
        }
    }
}
