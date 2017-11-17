package com.example.snicolas.henson_dsl_2;

/**
 * Created by snicolas on 11/17/17.
 */

public class ActivityClassFinder {
    public static Class getClassDynamically(String className) {
        try {
            return Class.forName(className);
        } catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
