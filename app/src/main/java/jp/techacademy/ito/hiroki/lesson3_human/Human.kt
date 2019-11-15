package jp.techacademy.ito.hiroki.lesson3_human

import android.util.Log

open class Human: Animal, Thinkable{
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }
    // Animalクラスのメソッドをオーバーライド
        override fun say() {
            Log.d("kotlintest", "私の名前は" + this.name + "です。")
            Log.d("kotlintest", "年は" + this.age + "歳です。")
        }

    // Thinkableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "「私は" + this.name + "について考える。」")
    }

}
