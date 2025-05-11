package io.mu.launchmodels.singletop

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.mu.launchmodels.R


/*<
* 2. singleTop
*
* Activity'leri görüntüleme : /Users/musauyumaz/Library/Android/sdk/platform-tools/adb shell dumpsys activity activities | grep "Hist"
*
* Eğer singleTop olarak ayarlanmış olan activity hali hazırda backstack'te bulunuyor ve backstack'in en üstünde yer alıyorsa (kullanıcıya görünen activity ise) bu durumda aynı activity'i tekrardan startActivity ile çağırmak o activity'nin 0'dan yeni instance'ının oluşturulmasını engeller. onNewIntent() fonksiyonunun yeni intent ile çağrılmasını sağlatır
*
* Ancak singleTop olarak ayarlanmış olan activity hali hazırda backstack'te bulunmuyorsa, ya da bulunuyor ama top activity değilse, bu durumda standart akış devam eder. Yani yeni instance'ı 0'dan oluşacak ve backstack'e eklenecektir.
*
* FLAG_ACTIVITY_SINGLE_TOP flag'i singleTop launchMode'u ile aynı işi yapar.
*
* */

class MainActivitySingleTop : AppCompatActivity() {
    private lateinit var btnOpenSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_single_top)

        btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
           val intent = Intent(this, SecondActivitySingleTop::class.java).apply {
               flags = FLAG_ACTIVITY_SINGLE_TOP
           }
            startActivity(intent)
        }
    }
}