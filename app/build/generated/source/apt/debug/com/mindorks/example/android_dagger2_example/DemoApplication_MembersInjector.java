package com.mindorks.example.android_dagger2_example;

import com.mindorks.example.android_dagger2_example.data.DataManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DemoApplication_MembersInjector implements MembersInjector<DemoApplication> {
  private final Provider<DataManager> dataManagerProvider;

  public DemoApplication_MembersInjector(Provider<DataManager> dataManagerProvider) {
    this.dataManagerProvider = dataManagerProvider;
  }

  public static MembersInjector<DemoApplication> create(Provider<DataManager> dataManagerProvider) {
    return new DemoApplication_MembersInjector(dataManagerProvider);
  }

  @Override
  public void injectMembers(DemoApplication instance) {
    injectDataManager(instance, dataManagerProvider.get());
  }

  public static void injectDataManager(DemoApplication instance, DataManager dataManager) {
    instance.dataManager = dataManager;
  }
}
