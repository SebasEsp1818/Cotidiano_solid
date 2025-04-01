package DIP

interface Trabajador {
    fun trabajar()
}
interface Administrador {
    fun administrar()
}
interface Auditor {
    fun auditar()
}

class Desarrollador : Trabajador {
    override fun trabajar() {
        println("Desarrollando software...")
    }
}
class Gerente : Trabajador, Administrador {
    override fun trabajar() {
        println("Supervisando equipos...")
    }
    override fun administrar() {
        println("Administrando recursos...")
    }
}
class AuditorDeSeguridad : Auditor {
    override fun auditar() {
        println("Realizando auditoría de seguridad...")
    }
}

fun main() {
    val dev = Desarrollador()
    dev.trabajar()

}