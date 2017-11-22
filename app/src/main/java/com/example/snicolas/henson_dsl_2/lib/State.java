package com.example.snicolas.henson_dsl_2.lib;

import android.os.Bundle;

public abstract class State {
    protected final Bundle bundle;

    public State(Bundle bundle) {
        this.bundle = bundle;
    }
}
