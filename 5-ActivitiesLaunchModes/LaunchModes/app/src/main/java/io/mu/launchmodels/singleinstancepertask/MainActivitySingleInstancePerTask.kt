package io.mu.launchmodels.singleinstancepertask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R

/*
*
* 5. singleInstance
*
* /Users/musauyumaz/Library/Android/sdk/platform-tools/adb shell dumpsys activity activities | grep "Hist"
*
* Aslında bunun da mantığı singleInstance ile aynıdır.
*
* Başlatıldığı Task'ın her zaman root activity'sidir. SingleInstance'dan farklı olarak, kendi backstack'ine başka activity'ler eklenebilir. Ancak tekrar kendisi çağırıldığında backstack'de üstündeki tüm activity'leri öldürür.
*
* SingleInstancePerTask olarak ayarlanan activity'den başka standart bir activity açılırsa, bu durumda yeni açılan üçüncü activity SingleInstancePerTask olan activity'nin backstack'ini paylaşır. ve o backstack'in en üstüne eklenir. Böylece yeni task üzerinde 2 activity ilk açılan launcher activity'nin üzerinde sadece tek activity bulunur.
*
* Dolayısıyla, MainActivity -> SecondActivity -> ThirdActivity olarak devam ederseniz, ThirdActivity'den geriye bastığınızda SecondActivity'i açarsınız. SingleInstance'da olduğu gibi MainActivity'e dönmezsiniz.
*
* Çünkü en son açılan ThirdActivity ile SecondActivitty aynı task üzerinde ve aynı backstack'e sahip launcher olarak açılan MainActivity ise farklı task üzewrindeki farklı backstack'e sahiptir.
*
* Bunlardan tekrar SecondActivity'e dönmek isterseniz, SecondActivity'i start etmeniz yeterli Zaten hali hazırda ayrı bir task içinde bulunduğundan yeni bir instance'ı oluşturulmayacak onNewIntent() çağrılacaktır.
*
* singleTask ve singleInstancePerTask Task üzerindeki stack'te kendilerinden önde bulunan activity'leri silerler.
*
* Fakat bu durumda backstack'te en üstte yer almıyorsa, üstündeki tüm activity'ler silinecektir.
*
* Task1         -> Task2          -> Task2          -> Task2
* MainActivity  -> SecondActivity -> ThirdActivity  -> MainActivity (back pressed)
*
* Back:
*
* Task1         ->  Task2           ->  Task2
* MainActivity  ->  SecondActivity  ->  ThirdActivity
*
* Ancak bu activity'i FLAG_ACTIVITY_MULTIPLE_TASK veya FLAG_ACTIVITY_NEW_DOCUMENT flag'leri ile açarsak farklı Task'lar üzerinde birden fazla instance'ı bulunabilir.
* */

class MainActivitySingleInstancePerTask : AppCompatActivity() {
    private lateinit var btnOpenSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_single_instance_per_task)

        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            startActivity( Intent(this, SecondActivitySingleInstancePerTask::class.java))
        }
    }
}