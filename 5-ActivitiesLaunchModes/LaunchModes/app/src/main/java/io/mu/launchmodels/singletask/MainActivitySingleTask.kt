package io.mu.launchmodels.singletask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

/*
* 3. singleTask
*
*  /Users/musauyumaz/Library/Android/sdk/platform-tools/adb shell dumpsys activity activities | grep "Hist"
*
* Sistem activity'i yeni bir Task'ın root Activity'si olarak yerleştirir ya da mevcut Task'ı aynı affinity bilgisi ile yerleştirir.
*
* Eğer zaten stack'te aynı activity'nin instance'ı varsa yine onNewIntent() tetiklenir ve yeni bir versiyonu oluşturulmaz.
*
* Bu süreçte ilgili activity'nin instance'ı stack'te en yukarıda değilse, üzerinde bulunan tüm activity'ler yok edilir.
*
* Eğer SingleTask olarak ayarlanan activity onNewIntent() çağrısı ile çalıştırıldıysa, yeni instance'ı oluşmadığı için back tuşu stack'teki bir alttaki activity'e döner onNewIntent() çağrılmadan önceki state'e dönemez.
*
* android:taskAffinity="com.example.blabla" gibi bir farklı affinity bilgisi varsa bu durumda startActivity() ile yeni bir Task içinde root activity olarak açar. terminal log'unda t123 gibi task numarasının farklılaştığını görebiliriz.
*
* FLAG_ACTIVITY_NEW_TASK flag'i aynı işi yapar.
*
* */

class MainActivitySingleTask : AppCompatActivity() {
    private lateinit var btnOpenSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_single_task)

        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            startActivity( Intent(this, SecondActivitySingleTask::class.java))
        }
    }
}