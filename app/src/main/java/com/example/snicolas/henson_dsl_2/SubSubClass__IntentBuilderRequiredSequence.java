package com.example.snicolas.henson_dsl_2;

import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;
import com.example.snicolas.henson_dsl_2.lib.State;


public class SubSubClass__IntentBuilderRequiredSequence<ALL_REQUIRED_SET_STATE extends State> extends RequiredStateSequence<ALL_REQUIRED_SET_STATE> {


    public SubSubClass__IntentBuilderRequiredSequence(Bundle bundle, ALL_REQUIRED_SET_STATE allRequiredSetState) {
        super(bundle, allRequiredSetState);
    }

    //more methods might be needed, in this case their return intermediary
    //inner state classes, and the last one returns the allRequiredSetState

    public ALL_REQUIRED_SET_STATE u(String s) {
        bundle.putString("u", s);
        return allRequiredSetState;
    }
}
