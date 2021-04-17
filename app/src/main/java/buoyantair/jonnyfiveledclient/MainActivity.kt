package buoyantair.jonnyfiveledclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.io.Console

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        println("Hello world")
    }
}

