package xyz.kishorenarang.zotes

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import java.lang.Exception
import kotlin.concurrent.thread

class SplashscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
         val background = object : Thread() {
             override fun run() {
                 try {
                     Thread.sleep(1000)
                      val intent = Intent(baseContext,MainActivity::class.java)
                     startActivity(intent)
                 }catch (e: Exception){
                     e.printStackTrace()

                 }
             }

         }
         background.start()
    }
}
