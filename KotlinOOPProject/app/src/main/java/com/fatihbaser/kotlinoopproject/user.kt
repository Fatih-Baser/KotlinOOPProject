package com.fatihbaser.kotlinoopproject

class user {

    var name : String?=null
    var age : Int? =null


    //constructor vs init
    constructor(nameInput:String, ageInput:Int ){
        this.name=nameInput
        this.age=ageInput
    }
    init{
        println("init  ilk calisan kod")
    }

}