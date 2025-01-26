package com.metanit.oop.overidings

// Переопределение свойств
open class Person(val name: String){
    open var age: Int = 1

}

open class Employee(name:String): Person(name){

    override var age: Int = 18
}

open class PersonTwo(val name: String){

    open val fullInfo: String
        get() = "Person $name - $age"

    open var age: Int = 1
        set(value){
            if(value in 1..109)
                field = value
        }

    open fun display(){
        println("Name: $name")
    }
}
open class EmployeeTwo(name: String): PersonTwo(name){

    var company: String = "Undefined"
        set(value){
            field = value
        }
        get() {return field}

    override val fullInfo: String
        get() = "${super.fullInfo} Company: $company"

    override var age: Int = 18
        set(value){
            if(value in 18..109)
                field = value
        }

    /*final */ override fun display() {
        println("Name: $name    Company: $company")
    }
}

class ManagerTwo(name: String, company: String): EmployeeTwo(name){
    override fun display() {
        println("Name: $name Company: $company  Position: Manager")
    }
}

fun main() {

    val tom = PersonTwo("Tom")
    tom.age = 14
    tom.display()
    println(tom.fullInfo)

    val bob = EmployeeTwo("Bob")
    bob.age = 14
    tom.display()
    println(bob.fullInfo)

    val manager = ManagerTwo(tom.name, "JetBrains")
    manager.display()
    println(manager.fullInfo)
}