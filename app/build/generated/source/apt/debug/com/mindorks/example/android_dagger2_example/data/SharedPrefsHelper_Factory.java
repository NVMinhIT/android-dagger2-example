package com.mindorks.example.android_dagger2_example.data;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SharedPrefsHelper_Factory implements Factory<SharedPrefsHelper> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SharedPrefsHelper_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPrefsHelper get() {
    return new SharedPrefsHelper(sharedPreferencesProvider.get());
  }

  public static SharedPrefsHelper_Factory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SharedPrefsHelper_Factory(sharedPreferencesProvider);
  }
}
