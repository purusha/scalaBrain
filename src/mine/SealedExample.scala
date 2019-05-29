package mine

object SealedExample {

  /*
      sealed classes (or traits) can still be inherited in the same source file (where final classes can't be inherited at all).
   */

  sealed trait Duo
  case class One(i:Int) extends Duo
  case class Two(i:Int, j:Int) extends Duo

  def test(d:Duo): Unit = {
    d match {
      case One(x) => println(x)
      case _ => println("ERROR")
    }
  }

  def main(args: Array[String]): Unit = {
    val one = One(13)
    val two = Two(13, 42)

    test(one)
    test(two)
  }
}
