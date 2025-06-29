package com.muyumaz.dependencyinjection.analytics

import android.util.Log
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {
    override fun foo() {
        Log.i("TAG","foo")
    }
}