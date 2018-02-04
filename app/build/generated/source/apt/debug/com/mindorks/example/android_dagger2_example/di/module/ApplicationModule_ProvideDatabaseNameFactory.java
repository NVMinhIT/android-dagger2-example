package com.mindorks.example.android_dagger2_example.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideDatabaseNameFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideDatabaseNameFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideDatabaseNameFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideDatabaseNameFactory(module);
  }

  public static String proxyProvideDatabaseName(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
