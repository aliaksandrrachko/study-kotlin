package com.metanit.collections.immmtableandmutables

fun main() {
    val countries: Map<String, Int> = mapOf("USA" to 300, "France" to 60, "Germany" to 81)

    println(countries["USA"])   // 300
    for(country in countries){
        println("${country.key} - ${country.value}")
    }
    println(countries)


    val countriesMutable: MutableMap<String, Int> = mutableMapOf("USA" to 300, "France" to 60, "Germany" to 81)

    countriesMutable.put("Spain", 33)  // добавляем новый элемент с ключом "Spain" и значением 33
    countriesMutable.remove("France")  // удаляем элемент с ключом "France"

    for(country in countriesMutable){
        println("${country.key} - ${country.value}")
    }
    println(countriesMutable)


    val map1: LinkedHashMap<Int, String> = linkedMapOf(1 to "1", 2 to "2")
    val map2: HashMap<Int, String> = hashMapOf(1 to "1", 2 to "2")
}
