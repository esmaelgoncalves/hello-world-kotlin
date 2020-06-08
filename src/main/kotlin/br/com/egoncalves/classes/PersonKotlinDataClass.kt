package br.com.egoncalves.classes

// Using data class (kotlin give us equals, hash code, toString and copy methods)
data class PersonKotlinDataClass(val name: String, val age: Int, var active: Boolean = true)

fun main() {
    val personData = PersonKotlinDataClass("Fulano Kotlin Class", 28, true)
    val personData2 = PersonKotlinDataClass("Fulano Kotlin Class", 28, true)

    println(personData) // PersonJavaDataClass{name='Fulano Kotlin Class', age=28, active=true}

    // should compare content equality (IDE suggests to change to == operator)
    println(personData.equals(personData2)) // true

    // also should compare content equality
    println(personData == personData2) // true

    // should compare reference equality
    println(personData === personData2) // false


    val personData3 = personData.copy(age = 30) // copy object changing the age property

    println(personData3) //PersonJavaDataClass{name='Fulano Kotlin Class', age=30, active=true}
}