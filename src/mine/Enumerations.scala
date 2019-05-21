package mine

import mine.Enumerations.WeekDay.WeekDay

object Enumerations {

  object WeekDay extends Enumeration {
    type WeekDay = Value

    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
  }

  def main(args: Array[String]): Unit = {

    def isWorkingDay(d: WeekDay) = ! (d == WeekDay.Sat || d == WeekDay.Sun)

    WeekDay.values filter isWorkingDay foreach println

  }
}
