package com.myapp.test

import android.widget.TextView
import com.myapp.{MainActivity, R}
import org.junit.runner.RunWith
import org.junit.{Before, Test}
import org.robolectric.annotation.Config
import org.robolectric.{Robolectric, RobolectricTestRunner}
import org.scalatest.Matchers
import org.scalatest.junit.JUnitSuite

@RunWith(classOf[RobolectricTestRunner])
@Config(
  manifest = "src/main/AndroidManifest.xml",
  resourceDir = "../../target/android-bin/resources/res",
  emulateSdk = 16,
  reportSdk = 16
)
class MainTest extends JUnitSuite with Matchers {
  
  @Test
  def simpleCase() {
    val context = Robolectric.application.getApplicationContext
    val mainActivity = Robolectric.setupActivity(classOf[MainActivity])
    val view = mainActivity.findViewById(R.id.simpleTextView).asInstanceOf[TextView]
    view.getText.toString shouldBe context.getString(R.string.welcome)
  }

}
