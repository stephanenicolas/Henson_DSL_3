package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.ActivityClassFinder.getClassDynamically;


public class SuperClass__IntentBuilderPart<ALL_SET_STATE> {

    private Intent intent;
    private final ALL_SET_STATE allSetState;
    private Bundle bundle = new Bundle();

    public SuperClass__IntentBuilderPart(Context context, ALL_SET_STATE allSetState) {
        intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
        this.allSetState = allSetState;
    }

    public ALL_SET_STATE s(String s) {
        bundle.putString("s", s);
        return allSetState;
    }

    public Intent getIntent() {
        return intent;
    }
}
