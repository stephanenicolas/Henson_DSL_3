package com.example.snicolas.henson_dsl_2;

public class Usage {

    public static void main() {

        new SuperClass__IntentBuilder(null)
                .s("a")
                .a(0)
                .build();

        new SubClass__IntentBuilder(null)
                .t("t")
                .s("s")
                .a(0)
                .b(1)
                .build();

        new NoRequiredSubClass__IntentBuilder(null)
                .s("s")
                .b(1)
                .a(0)
                .build();

        new NoOptionalSubClass__IntentBuilder(null)
                .t("t")
                .s("s")
                .a(0)
                .build();

        new SubSubClass__IntentBuilder(null)
                .u("u")
                .t("t")
                .s("s")
                .a(0)
                .c(2)
                .b(1)
                .build();
    }

}
