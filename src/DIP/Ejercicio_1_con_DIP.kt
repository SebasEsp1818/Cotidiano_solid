package DIP
interface encendible {
    fun Encender()
    fun Apagar()
}
interface conectividad {
    fun ConectarWifi()
}
interface actualizaciones {
    fun Actualizarfirmware()
}
class Lampara: encendible{
    override fun Encender() {
        println("Encendiendo la lámpara")
    }

    override fun Apagar() {
        println("Apagando la lámpara")
    }
}

fun main() {
    val lampara: encendible = Lampara()
    lampara.Encender()
    lampara.Apagar()
}
