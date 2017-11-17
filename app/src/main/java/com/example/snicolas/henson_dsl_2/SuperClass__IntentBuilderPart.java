package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.ActivityClassFinder.getClassDynamically;


public class SuperClass__IntentBuilderPart<ALL_SET_STATE> {

    private final ALL_SET_STATE allSetState;
    private Bundle bundle;

    public SuperClass__IntentBuilderPart(Bundle bundle, ALL_SET_STATE allSetState) {
        this.allSetState = allSetState;
        this.bundle = bundle;
    }

    public ALL_SET_STATE s(String s) {
        bundle.putString("s", s);
        return allSetState;
    }
}
