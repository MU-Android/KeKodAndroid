package com.musauyumaz.dependencyinjection.analytics

import javax.inject.Inject

class Logger @Inject constructor(){
    fun boo(){
        println("boo")
    }
}