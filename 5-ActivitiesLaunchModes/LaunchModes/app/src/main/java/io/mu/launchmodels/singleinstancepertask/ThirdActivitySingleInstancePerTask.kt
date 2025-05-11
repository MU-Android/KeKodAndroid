package io.mu.launchmodels.singleinstancepertask

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_MULTIPLE_TASK
import android.content.Intent.FLAG_ACTIVITY_NEW_DOCUMENT
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

class ThirdActivitySingleInstancePerTask : AppCompatActivity() {
    private lateinit var btnOpenSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_single_instance_per_task)

        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivitySingleInstancePerTask::class.java).apply {
                flags = FLAG_ACTIVITY_MULTIPLE_TASK or FLAG_ACTIVITY_NEW_DOCUMENT
            }
            startActivity(intent)
        }
    }
}