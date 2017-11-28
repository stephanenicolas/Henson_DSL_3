package com.example.snicolas.henson_dsl_2.tests.both_parent;

import com.example.snicolas.henson_dsl_2.tests.subsub.SubSubClass__IntentBuilder;

public class Usage {

    public static void main() {

        new SuperClass__IntentBuilder()
                .getInitialState(null)
                .s("a")
                .a(0)
                .build();

        new BothSubClass__IntentBuilder()
                .getInitialState(null)
                .t("t")
                .s("s")
                .a(0)
                .b(1)
                .build();

        new OptSubClass__IntentBuilder()
                .getInitialState(null)
                .s("s")
                .b(1)
                .a(0)
                .build();

        new ReqSubClass__IntentBuilder()
                .getInitialState(null)
                .t("t")
                .s("s")
                .a(0)
                .build();

        new SubSubClass__IntentBuilder(null)
                .getInitialState()
                .u("u")
                .t("t")
                .s("s")
                .a(0)
                .c(2)
                .b(1)
                .build();
    }

}
