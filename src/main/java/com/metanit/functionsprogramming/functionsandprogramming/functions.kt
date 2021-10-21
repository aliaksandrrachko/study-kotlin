package com.metanit.functionsprogramming.functionsandprogramming

//    fun имя_функции (параметры) : возвращаемый_тип{
//        выполняемые инструкции
//    }

fun main(){

    hello()
    showMessage("Show message")
    displayUser("user", 23)
    displayUser("user", 23, "1")
    // Именованные аргументы
    displayUser("Tom", position="Manager", age=28)
}

// top-level functions
fun hello(){
    println("Hello")
}

fun showMessage(message: String){
    println(message)
}

fun displayUser(name: String, age: Int){
    println("Name: $name   Age: $age")
}

// Аргументы по умолчанию
fun displayUser(name: String, age: Int = 18, position: String="unemployed"){
    println("Name: $name   Age: $age  Position: $position")
}

// Изменение параметров
fun double(n: Int){
    //n *= 2   // !Ошибка - значение параметра нельзя изменить
    println("Значение в функции double: $n")
}