/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    val nombre: String = "emir"
    var edad = 15
    println("Hola $nombre")
    println("Tengo $edad")
    println(App().greeting)
}
