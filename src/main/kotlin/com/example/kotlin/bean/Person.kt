package com.example.kotlin.bean

class Person {
    var lastName:String = ""
    get() = field.toUpperCase()
    set

    var no:Int =10
    get()=field
    set(value){
        field = value + 100
    }
}