package com.example.snicolas.henson_dsl_2.tests.opt_parent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.example.snicolas.henson_dsl_2.lib.AllRequiredSetState;

import static com.example.snicolas.henson_dsl_2.lib.ActivityClassFinder.getClassDynamically;

public class SuperClass__IntentBuilder {

  public static InitialState getInitialState(Context context) {
    final Intent intent = new Intent(context, getClassDynamically("com.example.module1.Foo"));
    final Bundle bundle = new Bundle();
    return new InitialState(bundle, intent);
  }

  public static <ALL_SET extends AllSet> ALL_SET getNextState(Bundle bundle, ALL_SET allSetState) {
    return allSetState;
  }

  public static class InitialState extends ResolvedAllSet {
    public InitialState(Bundle bundle, Intent intent) {
      super(bundle, intent);
    }
  }

  public static class ResolvedAllSet extends AllSet<ResolvedAllSet> {
    public ResolvedAllSet(Bundle bundle, Intent intent) {
      super(bundle, intent);
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
