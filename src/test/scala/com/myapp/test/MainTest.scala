package com.myapp.test

import android.widget.TextView
import com.myapp.{MainActivity, R}
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.{Robolectric, RobolectricTestRunner, RuntimeEnvironment}
import org.scalatest.Matchers
import org.scalatest.junit.JUnitSuite

@RunWith(classOf[RobolectricTestRunner])
@Config(
  manifest = "src/main/AndroidManifest.xml",
  resourceDir = "../../target/android-bin/resources/res",
  sdk = Array(21)
)
class MainTest extends JUnitSuite with Matchers {

  @Test
  def simpleCase() {
    val context = RuntimeEnvironment.application.getApplicationContext
    val mainActivity = Robolectric.setupActivity(classOf[MainActivity])
    val view = mainActivity.findViewById(R.id.simpleTextView).asInstanceOf[TextView]
    view.getText.toString shouldBe context.getString(R.string.welcome)
  }

}
