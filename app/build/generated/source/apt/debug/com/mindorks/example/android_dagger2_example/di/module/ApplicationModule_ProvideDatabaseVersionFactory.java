package com.mindorks.example.android_dagger2_example.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideDatabaseVersionFactory implements Factory<Integer> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideDatabaseVersionFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return Preconditions.checkNotNull(
        module.provideDatabaseVersion(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideDatabaseVersionFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideDatabaseVersionFactory(module);
  }

  public static Integer proxyProvideDatabaseVersion(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDatabaseVersion(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
