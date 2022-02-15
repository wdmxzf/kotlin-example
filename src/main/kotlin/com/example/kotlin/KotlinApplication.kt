package com.example.kotlin

import com.example.kotlin.bean.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@SpringBootApplication
class KotlinApplication

fun main(args: Array<String>) {
//    runApplication<KotlinApplication>(*args)

    test1()
    test2()
    test3()
    test4()
    test5()
    test6()
    test7()

}

fun test7(){
    var person = Person()
    person.lastName = "zhgHGkfpw"
    person.no = 1000
    println("${person.no} :: ${person.lastName}")
}

fun  test6(){
    val i="runoob"
    val s = "$i.length is ${i.length}"
    println(s)
}

fun test5(){
    val text = """
        |duo
        |adfd
        |iti
    """.trimMargin()
    println(text)
}

fun test4(){
    var a:String?= "4"
    val age = a!!.toInt()
    println(age)

    a = null
    println(a?.toInt())
}

fun test3(){
    var a =2;
    val s1 = "a is $a";
    println(s1)
    a = 4;
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

fun test2(){
    val sumL:(Int, Int) -> Int = {x,y->x+y}
    println(sumL(1,3));
}

fun test1(){
    var age :String ? = "123"; // 123
    age = null// -1
    val a = age?.toInt()?:-1
    println(a)
}
