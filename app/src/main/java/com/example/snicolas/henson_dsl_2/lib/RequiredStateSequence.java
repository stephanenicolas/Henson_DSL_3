package com.example.snicolas.henson_dsl_2.lib;

import android.os.Bundle;

public class RequiredStateSequence<ALL_REQUIRED_SET_STATE extends State> extends State {
    protected final ALL_REQUIRED_SET_STATE allRequiredSetState;

    public RequiredStateSequence(Bundle bundle, ALL_REQUIRED_SET_STATE allRequiredSetState) {
        super(bundle);
        this.allRequiredSetState = allRequiredSetState;
    }
}
