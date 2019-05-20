package tour

object XXX {
  def main(args: Array[String]): Unit = {

    val bound = List(1, 2, 3)

    bound.foreach(println(_))
    bound.foreach(x => println(x))

    println(bound.foldLeft(0)(_ + _))
    println(bound.foldLeft(0)((a, b) => a + b))

  }
}
