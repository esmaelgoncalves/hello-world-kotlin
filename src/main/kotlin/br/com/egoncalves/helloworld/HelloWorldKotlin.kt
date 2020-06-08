package br.com.egoncalves.helloworld

fun main(args: Array<String>) {
    if(args?.size > 0) println("Hello ${args[0]} ") else println("Hello World")
}