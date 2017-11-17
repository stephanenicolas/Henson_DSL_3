package com.example.snicolas.henson_dsl_2;

/**
 * Created by snicolas on 11/16/17.
 */

public class Usage {

    public static void main() {

        new SuperClass__IntentBuilder(null)
                .s("a")
                .a(0)
                .build();

        new SubClass__IntentBuilder(null)
                .t("t")
                .s("a")
                .b(0)
                .a(1)
                .build();
    }

}
