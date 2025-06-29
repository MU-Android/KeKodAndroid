package com.muyumaz.dependencyinjection.di

import com.muyumaz.dependencyinjection.network.AuthInterceptor
import com.muyumaz.dependencyinjection.network.OtherInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class)
object NetworkModule {
    @AuthInterceptorRetrofit
    @Provides
    fun provideAuthRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .build()
    }

    @OtherInterceptorRetrofit
    @Provides
    fun provideOtherRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .build()
    }
}