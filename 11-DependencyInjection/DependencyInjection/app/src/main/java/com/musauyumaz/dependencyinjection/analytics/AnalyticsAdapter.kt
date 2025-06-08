package com.musauyumaz.dependencyinjection.analytics

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    val service: AnalyticsService,
    val logger: Logger
)
