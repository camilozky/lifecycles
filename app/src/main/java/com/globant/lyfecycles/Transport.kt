package com.globant.lyfecycles

abstract class Transport(open var show: String) {
    abstract fun doMove(): String
}

open class Road : Transport("Road") {
    var tireType: String = "pneumatic tyre"
    override fun doMove() = "Driving"
}

open class Motorcycle(override var show: String, displacement: String, private var power: String, private var torque: String) : Road()
open class Pulsar(var name: String, var ownerName: String) : Motorcycle(
        "Pulsar",
        "199.5 c.c.",
        "23.5 HP a 9,500 rpm",
        "18.3 Nm a 8,000 rpm") {
    override fun doMove(): String {
        return "verify accelerator " + super.doMove()
    }
}

open class Boxer(var name: String, var ownerName: String) : Motorcycle(
        "Boxer",
        "144.08 cc",
        "8.83 HP a 7,500 rpm",
        "12.26 Nm a 4,500 rpm"
)

fun main() {

    val polymorphism: Road = Pulsar("Scarlett", "Camilo")
    val inheritance = Road()
    println(polymorphism.show)
    println(inheritance.show)
}