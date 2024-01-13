package curso.traits

//Paso 1: Definición del Trait Nadador:
trait Corredor {
  def correr(): Unit = {
    //println("¡Estoy Corriendo!")
  }
}
//Paso 2: Definición de una Clase que Utiliza el Trait Nadador:
class animal(nombre: String) extends Corredor {
  def presentarse(): Unit = {
    println(s"Hola soy el conejo $nombre, y perdi la carrera apostada con la tortuga :(")
    correr() // Llama al método nadar del trait
  }
}
//Paso 3: Creación de un Objeto y Llamada a Métodos:
object mensaje {
  def main(args: Array[String]): Unit = {
    val liebre = new animal("Bugs bunny")
    liebre.presentarse() // Salida: Soy Bugs buny, y perdi la carrera apostada con la tortuga
    //pato.nadar() // Salida: ¡Estoy nadando!
  }
}
