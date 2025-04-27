package io.mu.helloandroid

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("Kekod", "onCreate")

        setContentView(R.layout.activity_main)

        Log.e("Kekod", "onCreate2")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Kekod", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.e("Kekod", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Kekod", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Kekod", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Kekod", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Kekod", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val etUserField = findViewById<EditText>(R.id.etUserField)
        val userField = etUserField.text.toString()
        outState.putString("userField", userField)

        Log.e("Kekod", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val userField = savedInstanceState.getString("userField")
        val etUserField = findViewById<EditText>(R.id.etUserField)
        etUserField.setText(userField)

        Log.e("Kekod", "onRestoreInstanceState")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e("Kekod", "onBackPressed")
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        Log.e("Kekod", "onUserLeaveHint")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.e("Kekod", "onUserInteraction")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.e("Kekod", "onContentChanged")
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