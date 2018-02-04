package com.mindorks.example.android_dagger2_example.di.module;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideSharedPrefsFactory
    implements Factory<SharedPreferences> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideSharedPrefsFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.provideSharedPrefs(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideSharedPrefsFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideSharedPrefsFactory(module);
  }

  public static SharedPreferences proxyProvideSharedPrefs(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideSharedPrefs(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
