package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.ActivityClassFinder.getClassDynamically;


public class SubClass__IntentBuilderPart<ALL_SET_STATE> {

    private Intent intent;
    private final ALL_SET_STATE allSetState;
    private Bundle bundle = new Bundle();

    public SubClass__IntentBuilderPart(Context context, ALL_SET_STATE allSetState) {
        intent = new Intent(context, getClassDynamically("com.example.module1.FooSub"));
        this.allSetState = allSetState;
    }

    public ALL_SET_STATE t(String s) {
        bundle.putString("t", s);
        return allSetState;
    }

    public Intent getIntent() {
        return intent;
    }
}
