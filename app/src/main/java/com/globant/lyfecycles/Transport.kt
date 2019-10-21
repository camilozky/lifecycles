abstract class Transport(open var show: String) {
    abstract fun doMove(): String
}

open class Road : Transport("Road") {
    var tireType: String = "pneumatic tyre"
    override fun doMove() = "Driving"
}

open class Motorcycle(
    override var show: String = "Moto",
    displacement: String = "N/A",
    private var power: String = "N/A",
    private var torque: String = "N/A"
) : Road()

open class Pulsar(var name: String, var ownerName: String) : Motorcycle(
    "Pulsar",
    "199.5 c.c.",
    "23.5 HP a 9,500 rpm",
    "18.3 Nm a 8,000 rpm"
) {
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

val polymorphism: Motorcycle = Pulsar("Scarlett", "Camilo")
val inheritance: Motorcycle = Motorcycle()
println(polymorphism.show)
println(inheritance.show)
