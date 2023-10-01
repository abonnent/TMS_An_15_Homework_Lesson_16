package solutions.belov.tms_an_15_homework_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    private lateinit var timer: CountDownTimer
    private lateinit var counter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        counter = findViewById(R.id.counter)

        timer = object : CountDownTimer(4000, 1) {
            override fun onTick(millisUntilFinished: Long) {
                counter.text = "${millisUntilFinished / 1000}".toString()
            }

            override fun onFinish() {
                startActivity(Intent(this@SplashActivity, OnBoarding1Activity::class.java))
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
    }
}