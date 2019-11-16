package jp.techacademy.ito.hiroki.lesson3_human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("ベッジ", 42, "絵画鑑賞")
        human.say()
        human.think()

        val human2 = Human("キッド", 23, "音楽鑑賞")
        human2.say()
        human2.think()


    }
}
