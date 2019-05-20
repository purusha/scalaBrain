package tour

object Tuples {
  def main(args: Array[String]): Unit = {

    val ingredient = ("Sugar" , 25)

    println(ingredient.getClass.getSimpleName)

    val (name, quantity) = ingredient
    println(name)
    println(quantity)

    val numPairs = List((2, 5), (3, -7), (20, 56))
    for ((a, b) <- numPairs) {
      println(a * b)
    }

  }
}
