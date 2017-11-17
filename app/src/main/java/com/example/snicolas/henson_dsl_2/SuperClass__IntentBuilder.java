package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.ActivityClassFinder.getClassDynamically;


public class SuperClass__IntentBuilder {

    private Bundle bundle = new Bundle();
    private SuperClass__IntentBuilderPart<AllSet> part;
    private final Intent intent;

    public SuperClass__IntentBuilder(Context context) {
        intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
        AllSet allSet = new AllSet(bundle, intent);
        part = new SuperClass__IntentBuilderPart<>(bundle, allSet);
    }

    public SuperClass__IntentBuilder.AllSet s(String s) {
        return part.s(s);
    }

    public static class AllSet {
        protected final Bundle bundle;
        protected Intent intent;

        public AllSet(Bundle bundle, Intent intent) {
            this.bundle = bundle;
            this.intent = intent;
        }

        public AllSet a(int a ) {
            bundle.putInt("a", a);
            return this;
        }

        public Intent build() {
            intent.putExtras(bundle);
            return intent;
        }
    }
}
