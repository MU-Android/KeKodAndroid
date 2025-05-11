package io.mu.launchmodels.singleinstance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

/*
*
* 4. singleInstance
*
* /Users/musauyumaz/Library/Android/sdk/platform-tools/adb shell dumpsys activity activities | grep "Hist"
*
* */

class MainActivitySingleInstance : AppCompatActivity() {
    private lateinit var btnOpenSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_single_instance)

        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            startActivity( Intent(this, SecondActivitySingleInstance::class.java))
        }
    }
}