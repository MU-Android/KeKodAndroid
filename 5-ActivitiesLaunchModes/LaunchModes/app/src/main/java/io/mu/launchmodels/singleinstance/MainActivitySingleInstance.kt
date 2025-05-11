package io.mu.launchmodels.singleinstance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

/*
*
* 4. singleInstance
*
* /Users/musauyumaz/Library/Android/sdk/platform-tools/adb shell dumpsys activity activities | grep "Hist"
*
* Aslında mantık singşeTask il aynıdır.
*
* Fakat sistem bu activity'i barındıran Task üzerinde bakka bir activity'nin başlatımasına izin vermez. Yani üzerinde bulunduğu Task'ın tek ve yegane üyesidir. Yani backstack'i paylaşmaz.
*
* SingleInstance olarak ayarlanan bir activity'den başka standart bir activity açılırsa, bu durumda yeni açılan üçüncü activity ilk activity'nin backstack'ini paylaşır ve o backstack'in en üstüne eklenir. SıngleInstance olarak açılan activity'nin backstack'i bu iki activity'den farklıdır.
*
*
* Dolayısıyla, MainActivity -> SecondActivity -> ThirdActivity olarak devam ederseniz, ThirdActivity'den geriye bastığınızda(backpressed) SecondActivity'e değil MainActivity'e dönersiniz.
*
* Çünkü ThirdActivity ile MainActivity aynı backstack'e sahip, SecondActivity ise farklı bir backstack'e sahiptir. Bunlardan tekrar SecondActivity'e dönmek isterseniz, SecondActivity'i start etmeniz yeterli. Zaten hali hazırda ayrı bir task içinde bulunduğundan yeni bir instance'ı oluşturulmayacak onNewIntent() çağırılacaktır.
*
* SingleTask'tan farklı olarak; tasktAffinity bilgisi olmadan harici bir task'ı kesin oluşturur. SingleTask ile affinity bilgisi kullanılarak oluşturulan yeni task recent app (overview) ekranında gözükürken SingleInstance ile oluşturulan yeni task recent app (overview) kısmında gözükmez buna rağmen kesin olarak yeni bir task'ın oluştuğunu loglardan teyit edebiliriz.
*
* Task1         ->  Task2         -> Task1          -> Task1
* MainActivity  -> SecondActivity -> ThirdActivity  -> MainActivity(back pressed)
* */

class MainActivitySingleInstance : AppCompatActivity() {
    private lateinit var btnOpenSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_single_instance)

        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            startActivity( Intent(this, SecondActivitySingleInstance::class.java))
        }
    }
}