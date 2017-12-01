package com.example.snicolas.henson_dsl_2.tests.opt_parent;

import com.example.snicolas.henson_dsl_2.tests.subsub.SubSubClass__IntentBuilder;

public class Usage {

    public static void main() {

        SuperClass__IntentBuilder
            .getInitialState(null)
            .build();

        SuperClass__IntentBuilder
            .getInitialState(null)
            .a(0)
            .build();

        BothSubClass__IntentBuilder
            .getInitialState(null)
            .t("t")
            .build();

        BothSubClass__IntentBuilder
            .getInitialState(null)
            .t("t")
            .a(0)
            .build();

        BothSubClass__IntentBuilder
            .getInitialState(null)
            .t("t")
            .b(1)
            .build();

        BothSubClass__IntentBuilder
            .getInitialState(null)
            .t("t")
            .a(0)
            .b(1)
            .build();

        OptSubClass__IntentBuilder
            .getInitialState(null)
            .build();

        OptSubClass__IntentBuilder
            .getInitialState(null)
            .a(0)
            .build();

        OptSubClass__IntentBuilder
            .getInitialState(null)
            .b(1)
            .build();

        ReqSubClass__IntentBuilder
            .getInitialState(null)
            .t("t")
            .build();

        ReqSubClass__IntentBuilder
            .getInitialState(null)
            .t("t")
            .a(0)
            .build();
    }
}
