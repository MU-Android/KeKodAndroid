package io.mu.launchmodels.singletop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

class SecondActivitySingleTop : AppCompatActivity() {
    private lateinit var btnOpenMainActivity: Button
    private lateinit var btnOpenSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_single_top)

        btnOpenMainActivity = findViewById<Button>(R.id.btnOpenMainActivity)
        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)

        btnOpenMainActivity.setOnClickListener {
            startActivity(Intent(this, MainActivitySingleTop::class.java))
        }

        btnOpenSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivitySingleTop::class.java))
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Toast.makeText(this, "New Intent", Toast.LENGTH_SHORT).show()
    }
}