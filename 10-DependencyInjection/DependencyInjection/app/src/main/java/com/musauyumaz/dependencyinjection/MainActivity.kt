package com.musauyumaz.dependencyinjection

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val netmera = Netmera()
//        netmera.init()
//        netmera.sentEvent("test")

        val dataroid = Dataroid()
        dataroid.init()
        dataroid.sentEvent("test", "tag")
    }
}

class Netmera(){
    fun init() {
    }
    fun sentEvent(eventName: String) {
    }
}

class Dataroid(){
    fun init() {
    }
    fun sentEvent(eventName: String, tag: String) {
    }
}