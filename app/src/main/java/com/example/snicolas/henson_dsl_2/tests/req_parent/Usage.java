package com.example.snicolas.henson_dsl_2.tests.req_parent;

import com.example.snicolas.henson_dsl_2.tests.subsub.SubSubClass__IntentBuilder;

public class Usage {

    public static void main() {

        new SuperClass__IntentBuilder(null)
                .s("a")
                .build();

        new BothSubClass__IntentBuilder(null)
                .t("t")
                .s("s")
                .build();

        new BothSubClass__IntentBuilder(null)
                .t("t")
                .s("s")
                .b(1)
                .build();

        new OptSubClass__IntentBuilder(null)
                .s("s")
                .build();

        new OptSubClass__IntentBuilder(null)
                .s("s")
                .b(1)
                .build();

        new ReqSubClass__IntentBuilder(null)
                .t("t")
                .s("s")
                .build();
    }

}
