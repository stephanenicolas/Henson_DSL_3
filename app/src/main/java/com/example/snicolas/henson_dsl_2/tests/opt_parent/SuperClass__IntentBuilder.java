package com.example.snicolas.henson_dsl_2.tests.opt_parent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.snicolas.henson_dsl_2.lib.AllRequiredSetState;
import com.example.snicolas.henson_dsl_2.lib.Empty;
import com.example.snicolas.henson_dsl_2.lib.RequiredStateSequence;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;

public class SuperClass__IntentBuilder {

    protected RequiredSequence<? extends AllSet> rs0;
    protected ResolvedAllSet allSet;

    public SuperClass__IntentBuilder(Context context) {
        final Intent intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
        final Bundle bundle = new Bundle();
        allSet = new ResolvedAllSet(bundle, intent);
        rs0 = new RequiredSequence<>(bundle, allSet);
    }

    public ResolvedAllSet a(int a ) {
        return rs0.a(a);
    }

    public Intent build() {
        return rs0.build();
    }

    public class ResolvedAllSet extends AllSet<ResolvedAllSet> {
        public ResolvedAllSet(Bundle bundle, Intent intent) {
            super(bundle, intent);
        }
    }

    public static class RequiredSequence<ALL_SET extends SuperClass__IntentBuilder.AllSet>
            extends RequiredStateSequence<ALL_SET> implements Empty {
        public RequiredSequence(Bundle bundle, ALL_SET allRequiredSetState) {
            super(bundle, allRequiredSetState);
        }

        public ResolvedAllSet a(int a ) {
            return (ResolvedAllSet) allRequiredSetState.a(a);
        }

        public Intent build() {
            return allRequiredSetState.build();
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
