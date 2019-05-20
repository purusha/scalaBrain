package tour

object ValVar {

  class NotPointMoving(val x: Int, val y: Int) {
    override def toString: String =
      s"NPM ($x, $y)"
  }

  class PointMoving(var x: Int, var y: Int) {
    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
    }

    override def toString: String =
      s"PM ($x, $y)"
  }

  def main(args: Array[String]): Unit = {

    val point1 = new PointMoving(2, 3)
    println(point1.x)
    println(point1)

    val point2 = new NotPointMoving(3, 5)
    println(point2.x)
    println(point2)

  }
}
