package tour

object Nested {

  def result: String = {

    def inner: String = {
      return System.currentTimeMillis().toString;
    }

    return inner
  }

  def main(args: Array[String]): Unit = {
    println(result)
  }

}
