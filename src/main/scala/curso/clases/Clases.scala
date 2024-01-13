package curso.clases

// Paso 1: Definir la Clase Persona
class Persona(nombre: String, val edad: Int) {
  // Atributos de la clase Persona
  // El prefijo 'var' indica que estos atributos son mutables, es decir, pueden cambiar.

  // Método para saludar
  def saludar(): Unit = {
    println(s"Hola, mi nombre es $nombre y tengo $edad años.")
  }
}

// Paso 2: Crear Objetos basados en la Clase Persona
// Los objetos son instancias de la clase y tienen acceso a sus atributos y métodos.
object MiApp {
  def main(args: Array[String]): Unit = {
    val persona1 = new Persona("Matthew Quispe", 5)
    val persona2 = new Persona("Hade Llamoca", 25)

    persona1.saludar() // Salida: Hola, mi nombre es Matthew Quispe y tengo 5 años.
    persona2.saludar() // Salida: Hola, mi nombre es Hade Llamoca y tengo 25 años.
  }
}


