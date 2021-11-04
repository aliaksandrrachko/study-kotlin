package com.metanit.oop.nestedclasses

class Person{

    class Account(val username: String, val password: String){

        fun showDetails(){
            println("UserName: $username  Password: $password")
        }
    }
}

fun main() {

    val userAcc = Person.Account("qwerty", "123456");
    userAcc.showDetails()

    val acc = BankAccount(3400);
    acc.Transaction().pay(2500)
}

// Внутренние (inner) классы
class BankAccount(private var sum: Int){

    fun display(){
        println("sum = $sum")
    }

    inner class Transaction{
        fun pay(s: Int){
            sum -= s
            display()
        }
    }
}

// Совпадение имен
// this@название_класса.имя_свойства_или_функции
class A {
    private val n: Int = 1

    inner class B{
        private val n: Int = 1
        fun action(){
            println(n)          // n из класса B
            println(this.n)     // n из класса B
            println(this@B.n)   // n из класса B
            println(this@A.n)   // n из класса A
        }
    }
}

