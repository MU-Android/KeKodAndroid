package io.mu.launchmodels.singletask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

class SecondActivitySingleTask : AppCompatActivity() {
    private lateinit var btnOpenMainActivity: Button
    private lateinit var btnOpenSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_single_task)

        btnOpenMainActivity = findViewById<Button>(R.id.btnOpenMainActivity)
        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)

        btnOpenMainActivity.setOnClickListener {
            startActivity(Intent(this, MainActivitySingleTask::class.java))
        }

        btnOpenSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivitySingleTask::class.java))
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Toast.makeText(this, "New Intent", Toast.LENGTH_SHORT).show()
    }
}