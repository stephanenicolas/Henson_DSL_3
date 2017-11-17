package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class SuperClass__IntentBuilder {

    private Bundle bundle = new Bundle();
    private SuperClass__IntentBuilderPart<AllSet> part;

    public SuperClass__IntentBuilder(Context context) {
        AllSet allSet = new AllSet(bundle);
        part = new SuperClass__IntentBuilderPart<>(context, allSet);
        allSet.setIntent(part.getIntent());
    }

    public SuperClass__IntentBuilder.AllSet s(String s) {
        return part.s(s);
    }

    public static class AllSet {
        protected final Bundle bundle;
        protected Intent intent;

        public AllSet(Bundle bundle) {
            this.bundle = bundle;
        }

        public void setIntent(Intent intent) {
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
