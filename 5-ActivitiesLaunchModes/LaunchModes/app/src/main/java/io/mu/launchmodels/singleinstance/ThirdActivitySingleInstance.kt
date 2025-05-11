package io.mu.launchmodels.singleinstance

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

class ThirdActivitySingleInstance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_single_instance)
    }
}