package br.com.egoncalves.classes

class PersonKotlin(val name: String, val age: Int, val active: Boolean)

fun main() {
    val person = PersonKotlin("Fulano Kotlin", 33, true)
    val person2 = PersonKotlin("Fulano Kotlin", 33, true)

    println("Person(name: ${person.name}, age: ${person.age}, active: ${person.active})")
    println(person) // Person(name: Fulano Kotlin, age: 33, active: true)

    // should compare content equality (IDE suggests to change to == operator)
    println(person.equals(person2)) // false

    // also should compare content equality
    println(person == person2) // false

    // should compare reference equality
    println(person === person2) // false
}