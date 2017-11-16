package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class SuperClass__IntentBuilder {

    private Intent intent;
    private Bundle bundle = new Bundle();

    public SuperClass__IntentBuilder(Context context) {
        intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
    }

    public Class getClassDynamically(String className) {
        try {
            return Class.forName(className);
        } catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public SuperClass__IntentBuilder.AllSet s(String s) {
        bundle.putString("s", s);
        return new SuperClass__IntentBuilder.AllSet();
    }

    public class AllSet {
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
