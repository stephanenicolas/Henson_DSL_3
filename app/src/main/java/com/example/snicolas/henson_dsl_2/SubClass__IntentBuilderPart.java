package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import static com.example.snicolas.henson_dsl_2.ActivityClassFinder.getClassDynamically;


public class SubClass__IntentBuilderPart<ALL_SET_STATE> {

    private final ALL_SET_STATE allSetState;
    protected final Bundle bundle;

    public SubClass__IntentBuilderPart(Bundle bundle, ALL_SET_STATE allSetState) {
        this.bundle = bundle;
        this.allSetState = allSetState;
    }

    public ALL_SET_STATE t(String s) {
        bundle.putString("t", s);
        return allSetState;
    }
}
