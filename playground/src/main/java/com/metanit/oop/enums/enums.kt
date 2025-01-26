package com.metanit.oop.enums

enum class Day(val value: Int){
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6),
    SUNDAY(7);
    fun getDuration(day: Day): Int{
        return value - day.value;
    }
}

fun main() {

    val day1: Day = Day.FRIDAY
    val day2: Day = Day.MONDAY
    println(day1.getDuration(day2))        // 4

    // Встроенные свойства и вспомогательные методы
    println(day1.name)
    println(day1.ordinal)
    println(day1.value)

    for (day in Day.values())
        println(day)

    println(Day.valueOf("FRIDAY"))

    DayTime.DAY.printName()     // День
    DayTime.NIGHT.printName()   // Ночь

    println("Day from ${DayTime.DAY.startHour} to ${DayTime.DAY.endHour}")

    DayTime.DAY.printName()     // День
    DayTime.NIGHT.printName()   // Ночь

    println(operate(5, 6, Operation.ADD))         // 11
    println(operate(5, 6, Operation.SUBTRACT))   // -1
    println(operate(5, 6, Operation.MULTIPLY))   // 30
}

// Анонимные классы и реализация интерфейсов
interface Printable{
    fun printName()
}

enum class DayTime: Printable{
    DAY{
        override val startHour = 6
        override val endHour = 21
        override fun printName(){
            println("День")
        }
    },
    NIGHT {
        override val startHour = 22
        override val endHour = 5
        override fun printName(){
            println("Ночь")
        }
    };
    abstract val startHour: Int
    abstract val endHour: Int
}

// Хранение состояния
enum class Operation{

    ADD, SUBTRACT, MULTIPLY
}

fun operate(n1: Int, n2: Int, op: Operation): Int{

    when(op){
        Operation.ADD -> return n1 + n2
        Operation.SUBTRACT -> return n1 - n2
        Operation.MULTIPLY -> return n1 *n2
    }
}
