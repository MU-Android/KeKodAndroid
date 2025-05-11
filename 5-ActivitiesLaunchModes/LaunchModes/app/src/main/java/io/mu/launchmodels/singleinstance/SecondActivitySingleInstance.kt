package io.mu.launchmodels.singleinstance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

class SecondActivitySingleInstance : AppCompatActivity() {
    private lateinit var btnOpenThirdActivity: Button
    private lateinit var btnOpenSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_single_instance)

        btnOpenThirdActivity = findViewById<Button>(R.id.btnOpenThirdActivity)
        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)

        btnOpenThirdActivity.setOnClickListener {
            startActivity(Intent(this, ThirdActivitySingleInstance::class.java))
        }

        btnOpenSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivitySingleInstance::class.java))
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Toast.makeText(this, "New Intent", Toast.LENGTH_SHORT).show()
    }
}