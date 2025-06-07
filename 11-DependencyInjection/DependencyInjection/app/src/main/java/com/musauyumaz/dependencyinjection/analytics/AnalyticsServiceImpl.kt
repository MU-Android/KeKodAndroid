package com.musauyumaz.dependencyinjection.analytics

import android.util.Log
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor(): AnalyticsService {
    override fun analyticsMethod() {
        Log.i("AnalyticsServiceImpl", "AnalyticsServiceImpl running")
    }
}