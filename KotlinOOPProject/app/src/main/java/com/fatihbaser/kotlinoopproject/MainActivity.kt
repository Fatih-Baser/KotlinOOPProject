package com.fatihbaser.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var myUser=user("ali",21)
        //myUser.age =25
       // myUser.name="fatih"

        println(myUser.age.toString())
        println(myUser.name)

        //constructor vs init

        var james=Musician("hasan","guitar",45)


        //static polymorfizm
        var mathematics=Mathematic()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))


        // dynamic polymorfizm

        var animal =Animal()
        val barley=Dog()
        barley.test()
        barley.sing()

        //absract & interface
         
    }
}