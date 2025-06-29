package com.muyumaz.dependencyinjection.analytics

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    val analyticsService: AnalyticsService,
    val logger: Logger
)