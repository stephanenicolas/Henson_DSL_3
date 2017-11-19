package com.example.snicolas.henson_dsl_2.tests.both_parent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.AllRequiredSetState;
import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;

public class SuperClass__IntentBuilder {

    protected RequiredSequence<? extends AllSet> rs0;

    public SuperClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
        final Bundle bundle = new Bundle();
        final ResolvedAllSet allSet = new ResolvedAllSet(bundle, intent);
        rs0 = new RequiredSequence<>(bundle, allSet);
    }

    public ResolvedAllSet s(String s) {
        return (ResolvedAllSet) rs0.s(s);
    }

    public class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_SET extends SuperClass__IntentBuilder.AllSet>
            extends RequiredStateSequence<ALL_SET> {
        public RequiredSequence(Bundle bundle, ALL_SET allRequiredSetState) {
            super(bundle, allRequiredSetState);
        }

        public ALL_SET s(String s) {
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
