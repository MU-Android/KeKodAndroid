package io.mu.helloandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import io.mu.helloandroid.ui.SecondActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("MainActivityLog", "onCreate")

        setContentView(R.layout.activity_main)

        Log.e("MainActivityLog", "onCreate2")

        val btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            finish()
//            startActivityForResult()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivityLog", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivityLog", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivityLog", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivityLog", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivityLog", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivityLog", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val etUserField = findViewById<EditText>(R.id.etUserField)
        val userField = etUserField.text.toString()
        outState.putString("userField", userField)

        Log.e("MainActivityLog", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val userField = savedInstanceState.getString("userField")
        val etUserField = findViewById<EditText>(R.id.etUserField)
        etUserField.setText(userField)

        Log.e("MainActivityLog", "onRestoreInstanceState")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e("MainActivityLog", "onBackPressed")
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        Log.e("MainActivityLog", "onUserLeaveHint")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.e("MainActivityLog", "onUserInteraction")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.e("MainActivityLog", "onContentChanged")
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
    }
}