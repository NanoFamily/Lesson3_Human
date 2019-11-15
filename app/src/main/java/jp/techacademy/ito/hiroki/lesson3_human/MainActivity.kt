package jp.techacademy.ito.hiroki.lesson3_human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("ひろき", 23) // 名前をひろき、年齢を23歳で、Humanのインスタンスを作る
        human.say()

        val human2 = Human("ひろき", 23)
        human2.think()

    }
}
