package curso.herencias
// HERENCIAS
//Paso 1: Definir la Clase Base (Superclase) -> Animal:
class Animal(nombre: String) {
  def hablar(): Unit = {
    println(s"El nombre de mi perro es $nombre y ladra mucho.")
  }
}

// Paso 2: Definir la Clase Derivada (Subclase) -> Perro:
//Para crear una clase derivada o subclase, utiliza la palabra clave extends seguida del nombre de la clase base:
class Perro(nombre: String, raza: String) extends Animal(nombre) {
  def ladrar(): Unit = {
    println(s"$nombre es de raza $raza y le gusta correr en el campo junto a la vaca")
  }
}

// Paso 3: Crear un Objeto de la Clase Derivada (Subclase) -> Perro:
object resultado {
  def main(args: Array[String]): Unit = {
    val miPerro1 = new Animal("Lalito")
    val miPerro2 = new Perro("Lalito", "pequeñez")

//Paso 4: Llamar a Métodos de la Superclase y la Subclase:
    miPerro1.hablar() // Salida: El nombre de mi perro es Lalito y ladra mucho.
    miPerro2.ladrar() // Salida: Lalito es de raza pequeñez y le gusta correr en el campo junto a la vaca
    miPerro1.hablar()
  }
}