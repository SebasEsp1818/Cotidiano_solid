package OCP


interface MetodoEnvio {
    fun enviar(archivo: String)
}


class EnvioFTP : MetodoEnvio {
    override fun enviar(archivo: String) {
   println("Enviando archivo por FTP: $archivo")
        }
}


class EnvioHTTP : MetodoEnvio {
    override fun enviar(archivo: String) {
       println("Enviando archivo por HTTP: $archivo")
        }
}


class EnvioArchivos(private val metodoEnvio: MetodoEnvio) {
    fun enviar(archivo: String) {
       metodoEnvio.enviar(archivo)
        }
}


fun main() {
    val envioFTP = EnvioArchivos(EnvioFTP())
    envioFTP.enviar("documento.txt")
    val envioHTTP = EnvioArchivos(EnvioHTTP())
    envioHTTP.enviar("imagen.png")
}