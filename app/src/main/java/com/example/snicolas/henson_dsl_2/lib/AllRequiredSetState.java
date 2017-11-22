package com.example.snicolas.henson_dsl_2.lib;

import android.content.Intent;
import android.os.Bundle;

public class AllRequiredSetState extends State {
    private Intent intent;

    public AllRequiredSetState(Bundle bundle, Intent intent) {
        super(bundle);
        this.intent = intent;
    }

    public Intent build() {
        intent.putExtras(bundle);
        return intent;
    }
}
