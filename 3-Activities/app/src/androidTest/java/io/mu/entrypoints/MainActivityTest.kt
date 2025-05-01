package io.mu.entrypoints

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun testMainActivity1() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.moveToState(Lifecycle.State.RESUMED)
        }
    }

    @Test
    fun testMainActivity2() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.recreate()
        }
    }

    @Test
    fun testMainActivity3() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val intent = Intent(activity, SettingsActivity::class.java)
                startActivity(activity, intent, null)
            }
        }
    }

    @Test
    fun testMainActivity4() {
        launchActivity<MainActivity>().use { scenario ->
            onView(withId(R.id.btnOpenSettingsActivity)).perform(click())
        }
    }

    @Test
    fun testMainActivity5() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val name = "Musa"
                val surname = "UYUMAZ"
                val result = activity.someBusinessLogic(name, surname)
                Assert.assertEquals("Hello Musa UYUMAZ", result)
            }
        }
    }

    @Test
    fun testMainActivity6() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val name = "Musa"
                val surname: String? = null
                val result = activity.someBusinessLogic(name, surname)
                Assert.assertEquals("Hello Musa null", result)
            }
        }
    }
    @Test
    fun testMainActivity7() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val name: String? = null
                val surname = "UYUMAZ"
                val result = activity.someBusinessLogic(name, surname)
                Assert.assertEquals("Hello null UYUMAZ", result)
            }
        }
    }
    @Test
    fun testMainActivity8() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val name: String? = null
                val surname: String? = null
                val result = activity.someBusinessLogic(name, surname)
                Assert.assertEquals("Hello null null", result)
            }
        }
    }
    @Test
    fun testMainActivity9() {
        launchActivity<MainActivity>().use { scenario ->
            scenario.onActivity { activity ->
                val name = ""
                val surname = ""
                val result = activity.someBusinessLogic(name, surname)
                Assert.assertEquals("Hello  ", result)
            }
        }
    }
}