package com.mindorks.example.android_dagger2_example.data;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManager_Factory implements Factory<DataManager> {
  private final Provider<Context> contextProvider;

  private final Provider<DbHelper> dbHelperProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public DataManager_Factory(
      Provider<Context> contextProvider,
      Provider<DbHelper> dbHelperProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.contextProvider = contextProvider;
    this.dbHelperProvider = dbHelperProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public DataManager get() {
    return new DataManager(
        contextProvider.get(), dbHelperProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static DataManager_Factory create(
      Provider<Context> contextProvider,
      Provider<DbHelper> dbHelperProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new DataManager_Factory(contextProvider, dbHelperProvider, sharedPrefsHelperProvider);
  }
}
