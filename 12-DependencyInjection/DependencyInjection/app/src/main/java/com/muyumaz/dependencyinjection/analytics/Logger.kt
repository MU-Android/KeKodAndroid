package com.muyumaz.dependencyinjection.analytics

import javax.inject.Inject

class Logger @Inject constructor() {
    fun boo(){
        println("boo")
    }
}