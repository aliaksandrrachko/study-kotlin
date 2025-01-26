package com.metanit.basics.datatypes

fun main() {
    // Целочисленные типы
    val a: Byte = -10     // Byte: хранит целое число от -128 до 127 и занимает 1 байт
    val b: Short = 45     // Short: хранит целое число от -32 768 до 32 767 и занимает 2 байта
    val c: Int = -250     // Int: хранит целое число от -2 147 483 648 (-2^31) до 2 147 483 647 (2^31 - 1) и занимает 4 байта
    val d: Long = 300000  // Long: хранит целое число от –9 223 372 036 854 775 808 (-2^63) до 9 223 372 036 854 775 807 (2^63-1) и занимает 8 байт
    println(a) // -10
    println(b) // 45
    println(c) // -250
    println(d) // 30000

    // Целочисленные типы без знака
    val ua: UByte = 10U    // UByte: хранит целое число от 0 до 255 и занимает 1 байт
    val ub: UShort = 45U   // UShort: хранит целое число от 0 до 65 535 и занимает 2 байта
    val uc: UInt = 250U    // UInt: хранит целое число от 0 до 2^32 - 1 и занимает 4 байта
    val ud: ULong = 30000U // ULong: хранит целое число от 0 до 2^64-1 и занимает 8 байт
    println(ua) // 10
    println(ub) // 45
    println(uc) // 250
    println(ud) // 30000

    val address: Int = 0x0A1    // 161
    println(address) // 161

    val a1: Int = 0b0101    // 5
    val b1: Int = 0b1011     // 11
    println(a1)      // 5
    println(b1)      // 11

    // Числа с плавающей точкой
    val height: Double = 1.78    // Float: хранит число с плавающей точкой от -3.4*10^38 до 3.4*10^38 и занимает 4 байта
    val pi: Float = 3.14F        // Double: хранит число с плавающей точкой от ±5.0*10^-324 до ±1.7*10^308 и занимает 8 байта.
    println(height)      // 1.78
    println(pi)         // 3.14

    // Логический тип boolean
    val falseVariable: Boolean = false
    val trueVariable: Boolean = true

    // Символы
    val charA: Char = 'A'
    val charB: Char = 'B'
    val charC: Char = 'T'

//    \t: табуляция
//    \n: перевод строки
//    \r: возврат каретки
//    \': одинарная кавычка
//    \": двойная кавычка
//    \\: обратный слеш

    // Строки
    val name: String = "Name"
    println(name)
    val text: String = """
                        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
                    """
    println(text)

    // Шаблоны строк
    val firstName = "Tom"
    val lastName = "Smith"
    val welcome = "Hello, $firstName $lastName"
    println(welcome)    // Hello, Tom Smith

    // Выведение типа
    val age = 5
    val justName = "Just name"
    val sum = 45U

    // Статическая типизация и тип Any
    var anyVar: Any = "Any"
    println(anyVar)
    anyVar = 6758
    println(anyVar)
}