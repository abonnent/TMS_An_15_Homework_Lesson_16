package solutions.belov.tms_an_15_homework_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OnBoarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)
    }

    override fun onRestart() {
        super.onRestart()
        startActivity(Intent(this, OnBoarding2Activity::class.java))
    }
}