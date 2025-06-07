package com.musauyumaz.dependencyinjection.di

import com.musauyumaz.dependencyinjection.analytics.AnalyticsAdapter
import com.musauyumaz.dependencyinjection.analytics.AnalyticsService
import com.musauyumaz.dependencyinjection.analytics.AnalyticsServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsClass {
    @Binds
    abstract fun bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl): AnalyticsService
}