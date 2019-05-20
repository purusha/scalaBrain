package tour

object Companion {

  class Email(val username: String, val domainName: String)

  object Email {
    def fromString(emailString: String): Option[Email] = {
      emailString.split('@') match {
        case Array(a, b) => Some(new Email(a, b))
        case _ => None
      }
    }
  }

  def main(args: Array[String]): Unit = {

    val x = Email.fromString("scala.center@epfl.ch")
    println(x.nonEmpty)

    val y = Email.fromString("not a valid email")
    println(y.nonEmpty)

  }
}
