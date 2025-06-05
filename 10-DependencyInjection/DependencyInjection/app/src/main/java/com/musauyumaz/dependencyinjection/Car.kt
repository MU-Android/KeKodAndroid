package com.musauyumaz.dependencyinjection

class Car(private val engine: Engine) {

    fun start() {
        engine.start()
    }
}

class Plane() {
    private lateinit var engine: Engine

    fun setEngine(engine: Engine) {
        this.engine = engine
    }
    fun start() {
        engine.start()
    }
}

interface Engine {
    fun start()
}

class GasEngine : Engine {
    override fun start() {
        println("start gas engine")
    }
}

class ElectricEngine : Engine {
    override fun start() {
        println("start Electric engine")
    }
}

class HybridEngine : Engine {
    override fun start() {
        println("start Electric engine")
    }
}

fun main() {
    val gasEngine = GasEngine()
    val car = Car(gasEngine)
    car.start()

    val electricEngine = ElectricEngine()
    val car2 = Car(electricEngine)
    car2.start()

    val hybridEngine = HybridEngine()
    val car3 = Car(hybridEngine)
    car3.start()


    val plane = Plane()
    plane.setEngine(GasEngine())
    plane.start()
}