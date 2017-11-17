package com.example.snicolas.henson_dsl_2;

import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;
import com.example.snicolas.henson_dsl_2.lib.State;


public class SuperClass__IntentBuilderRequiredSequence<ALL_REQUIRED_SET_STATE extends State> extends RequiredStateSequence<ALL_REQUIRED_SET_STATE> {


    public SuperClass__IntentBuilderRequiredSequence(Bundle bundle, ALL_REQUIRED_SET_STATE allRequiredSetState) {
        super(bundle, allRequiredSetState);
    }

    public ALL_REQUIRED_SET_STATE s(String s) {
        bundle.putString("s", s);
        return allRequiredSetState;
    }
}
