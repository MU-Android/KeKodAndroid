package io.mu.launchmodels.singleinstancepertask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

class SecondActivitySingleInstancePerTask : AppCompatActivity() {
    private lateinit var btnOpenThirdActivity: Button
    private lateinit var btnOpenSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_single_instance_per_task)

        btnOpenThirdActivity = findViewById<Button>(R.id.btnOpenThirdActivity)
        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)

        btnOpenThirdActivity.setOnClickListener {
            startActivity(Intent(this, ThirdActivitySingleInstancePerTask::class.java))
        }

        btnOpenSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivitySingleInstancePerTask::class.java))
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Toast.makeText(this, "New Intent", Toast.LENGTH_SHORT).show()
    }
}