package tour

import java.util.UUID

object Companion {

  class Email(val username: String, val domainName: String) {
    import Email._

    def myId: String = generator
  }

  object Email {
    def fromString(emailString: String): Option[Email] = {
      emailString.split('@') match {
        case Array(a, b) => Some(new Email(a, b))
        case _ => None
      }
    }

    private def generator: String = UUID.randomUUID().toString
  }

  def main(args: Array[String]): Unit = {

    val x: Option[Email] = Email.fromString("scala.center@epfl.ch")
    println(x.nonEmpty)
    println(x.get.myId)

    val y: Option[Email] = Email.fromString("not a valid email")
    println(y.nonEmpty)

  }
  
}
