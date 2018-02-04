package com.mindorks.example.android_dagger2_example.di.component;

import android.app.Application;
import android.content.Context;
import com.mindorks.example.android_dagger2_example.DemoApplication;
import com.mindorks.example.android_dagger2_example.DemoApplication_MembersInjector;
import com.mindorks.example.android_dagger2_example.data.DataManager;
import com.mindorks.example.android_dagger2_example.data.DataManager_Factory;
import com.mindorks.example.android_dagger2_example.data.DbHelper;
import com.mindorks.example.android_dagger2_example.data.DbHelper_Factory;
import com.mindorks.example.android_dagger2_example.data.SharedPrefsHelper;
import com.mindorks.example.android_dagger2_example.data.SharedPrefsHelper_Factory;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule_ProvideApplicationFactory;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule_ProvideContextFactory;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule_ProvideDatabaseNameFactory;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule_ProvideDatabaseVersionFactory;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule_ProvideSharedPrefsFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private ApplicationModule applicationModule;

  private ApplicationModule_ProvideContextFactory provideContextProvider;

  private ApplicationModule_ProvideDatabaseNameFactory provideDatabaseNameProvider;

  private ApplicationModule_ProvideDatabaseVersionFactory provideDatabaseVersionProvider;

  private Provider<DbHelper> dbHelperProvider;

  private ApplicationModule_ProvideSharedPrefsFactory provideSharedPrefsProvider;

  private Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private Provider<DataManager> dataManagerProvider;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(builder.applicationModule);
    this.provideDatabaseNameProvider =
        ApplicationModule_ProvideDatabaseNameFactory.create(builder.applicationModule);
    this.provideDatabaseVersionProvider =
        ApplicationModule_ProvideDatabaseVersionFactory.create(builder.applicationModule);
    this.dbHelperProvider =
        DoubleCheck.provider(
            DbHelper_Factory.create(
                provideContextProvider,
                provideDatabaseNameProvider,
                provideDatabaseVersionProvider));
    this.provideSharedPrefsProvider =
        ApplicationModule_ProvideSharedPrefsFactory.create(builder.applicationModule);
    this.sharedPrefsHelperProvider =
        DoubleCheck.provider(SharedPrefsHelper_Factory.create(provideSharedPrefsProvider));
    this.dataManagerProvider =
        DoubleCheck.provider(
            DataManager_Factory.create(
                provideContextProvider, dbHelperProvider, sharedPrefsHelperProvider));
    this.applicationModule = builder.applicationModule;
  }

  @Override
  public void inject(DemoApplication demoApplication) {
    injectDemoApplication(demoApplication);
  }

  @Override
  public Context getContext() {
    return ApplicationModule_ProvideContextFactory.proxyProvideContext(applicationModule);
  }

  @Override
  public Application getApplication() {
    return ApplicationModule_ProvideApplicationFactory.proxyProvideApplication(applicationModule);
  }

  @Override
  public DataManager getDataManager() {
    return dataManagerProvider.get();
  }

  @Override
  public SharedPrefsHelper getPreferenceHelper() {
    return sharedPrefsHelperProvider.get();
  }

  @Override
  public DbHelper getDbHelper() {
    return dbHelperProvider.get();
  }

  private DemoApplication injectDemoApplication(DemoApplication instance) {
    DemoApplication_MembersInjector.injectDataManager(instance, dataManagerProvider.get());
    return instance;
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
