package com.example.snicolas.henson_dsl_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.AllRequiredSetState;
import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;

public class SuperClass__IntentBuilder {

    private final RequiredSequence<ResolvedAllSet> rs0;

    public SuperClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        rs0 = new RequiredSequence<>(bundle, allSet);
    }

    public ResolvedAllSet s(String s) {
        return rs0.s(s);
    }

    public class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_REQUIRED_SET_STATE extends SuperClass__IntentBuilder.AllSet> extends RequiredStateSequence<ALL_REQUIRED_SET_STATE> {
        public RequiredSequence(Bundle bundle, ALL_REQUIRED_SET_STATE allRequiredSetState) {
            super(bundle, allRequiredSetState);
        }

        public ALL_REQUIRED_SET_STATE s(String s) {
            bundle.putString("s", s);
            return allRequiredSetState;
        }
    }

    public static class AllSet<SELF extends AllSet<SELF>> extends AllRequiredSetState {
        public AllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }

        public SELF a(int a) {
            bundle.putInt("a", a);
            return (SELF) this;
        }
    }
}
