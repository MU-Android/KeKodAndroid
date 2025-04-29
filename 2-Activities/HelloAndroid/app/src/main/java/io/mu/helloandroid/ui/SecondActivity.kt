package io.mu.helloandroid.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import io.mu.helloandroid.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("SecondActivityLog", "onCreate")

        setContentView(R.layout.activity_second)

        Log.e("SecondActivityLog", "onCreate2")

        val param = intent.getStringExtra("key") ?: "default value"
        Log.e("ParametreLog", param)

        val bundle = intent.extras
        val bundleParam = bundle?.getString("keyBundle", "default bundle value") ?: "default bundle value"

        Log.e("ParametreLog", bundleParam)
//        val btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
//        btnOpenSecondActivity.setOnClickListener {
//            startActivity(Intent(this, SecondActivity::class.java))
//            finish()
////            startActivityForResult()
//        }
    }


    override fun onStart() {
        super.onStart()
        Log.e("SecondActivityLog", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.e("SecondActivityLog", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SecondActivityLog", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SecondActivityLog", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SecondActivityLog", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("SecondActivityLog", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val etUserField = findViewById<EditText>(R.id.etUserField)
        val userField = etUserField.text.toString()
        outState.putString("userField", userField)

        Log.e("SecondActivityLog", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val userField = savedInstanceState.getString("userField")
        val etUserField = findViewById<EditText>(R.id.etUserField)
        etUserField.setText(userField)

        Log.e("SecondActivityLog", "onRestoreInstanceState")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e("SecondActivityLog", "onBackPressed")
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        Log.e("SecondActivityLog", "onUserLeaveHint")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.e("SecondActivityLog", "onUserInteraction")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.e("SecondActivityLog", "onContentChanged")
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