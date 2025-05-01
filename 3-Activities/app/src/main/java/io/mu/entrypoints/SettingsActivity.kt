package io.mu.entrypoints

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val callBack = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.e("SettingsActivityLog", "onBackPressed")
                counter++
                if (2 > counter) {
                    Toast.makeText(this@SettingsActivity, "Çıkmak için iki kere tıkla : ${counter}", Toast.LENGTH_LONG).show()
                    isEnabled = false
                }
            }

        }
        onBackPressedDispatcher.addCallback(this, callBack)
    }

//    override fun onBackPressed() {
//        Log.e("SettingsActivityLog", "onBackPressed")
//        counter++
//        if (2 > counter) {
//            Toast.makeText(this@SettingsActivity, "Çıkmak için iki kere tıkla : ${counter}", Toast.LENGTH_LONG).show()
//        }else{
//            super.onBackPressed()
//        }
//    }
}