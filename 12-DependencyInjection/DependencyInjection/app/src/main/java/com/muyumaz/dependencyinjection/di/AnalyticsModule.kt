package com.muyumaz.dependencyinjection.di

import com.muyumaz.dependencyinjection.analytics.AnalyticsService
import com.muyumaz.dependencyinjection.analytics.AnalyticsServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsModule {
    @Binds
    abstract fun bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl) : AnalyticsService
}