package OCP

// Interfaz que define el comportamiento de una gráfica
interface Grafica{
    fun dibujar()
}


class GraficaBarras : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de barras")
    }
}

class GraficaLineas : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de líneas")
        }
}

// Función principal
fun main() {
    val graficas: List<Grafica> = listOf(GraficaBarras(), GraficaLineas())

    for (grafica in graficas) {
        grafica.dibujar()
        }
}