package solutions.belov.tms_an_15_homework_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OnBoarding3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding3)
    }

    override fun onRestart() {
        super.onRestart()
        startActivity(Intent(this, LoginActivity::class.java))
    }
}