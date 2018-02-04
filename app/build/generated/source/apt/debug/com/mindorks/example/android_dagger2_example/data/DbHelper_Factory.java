package com.mindorks.example.android_dagger2_example.data;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DbHelper_Factory implements Factory<DbHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<String> dbNameProvider;

  private final Provider<Integer> versionProvider;

  public DbHelper_Factory(
      Provider<Context> contextProvider,
      Provider<String> dbNameProvider,
      Provider<Integer> versionProvider) {
    this.contextProvider = contextProvider;
    this.dbNameProvider = dbNameProvider;
    this.versionProvider = versionProvider;
  }

  @Override
  public DbHelper get() {
    return new DbHelper(contextProvider.get(), dbNameProvider.get(), versionProvider.get());
  }

  public static DbHelper_Factory create(
      Provider<Context> contextProvider,
      Provider<String> dbNameProvider,
      Provider<Integer> versionProvider) {
    return new DbHelper_Factory(contextProvider, dbNameProvider, versionProvider);
  }
}
