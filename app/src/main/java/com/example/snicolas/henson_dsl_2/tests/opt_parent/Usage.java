package com.example.snicolas.henson_dsl_2.tests.opt_parent;

import com.example.snicolas.henson_dsl_2.tests.subsub.SubSubClass__IntentBuilder;

public class Usage {

    public static void main() {

        new SuperClass__IntentBuilder(null)
                .build();

        new SuperClass__IntentBuilder(null)
                .a(0)
                .build();

        new BothSubClass__IntentBuilder(null)
                .t("t")
                .build();

        new BothSubClass__IntentBuilder(null)
                .t("t")
                .a(0)
                .build();

        new BothSubClass__IntentBuilder(null)
                .t("t")
                .b(1)
                .build();

        new BothSubClass__IntentBuilder(null)
                .t("t")
                .a(0)
                .b(1)
                .build();

        new OptSubClass__IntentBuilder(null)
                .build();

        new OptSubClass__IntentBuilder(null)
                .a(0)
                .build();

        new OptSubClass__IntentBuilder(null)
                .b(1)
                .build();

        new ReqSubClass__IntentBuilder(null)
                .t("t")
                .build();

        new ReqSubClass__IntentBuilder(null)
                .t("t")
                .a(0)
                .build();
    }

}
