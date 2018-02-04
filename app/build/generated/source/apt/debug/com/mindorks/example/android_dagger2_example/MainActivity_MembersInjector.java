package com.mindorks.example.android_dagger2_example;

import com.mindorks.example.android_dagger2_example.data.DataManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DataManager> mDataManagerProvider;

  public MainActivity_MembersInjector(Provider<DataManager> mDataManagerProvider) {
    this.mDataManagerProvider = mDataManagerProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<DataManager> mDataManagerProvider) {
    return new MainActivity_MembersInjector(mDataManagerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectMDataManager(instance, mDataManagerProvider.get());
  }

  public static void injectMDataManager(MainActivity instance, DataManager mDataManager) {
    instance.mDataManager = mDataManager;
  }
}
