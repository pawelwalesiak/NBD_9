trait Maybe3[+A] {
  def applyFunction[R](f: A => R): Maybe3[R]
}

case class No3() extends Maybe3[Nothing]{
  override def applyFunction[R](f: Nothing => R): Maybe3[R] = No3()
}

case class Yes3[A](value: A) extends Maybe3[A] {
  override def applyFunction[R](f: A => R): Maybe3[R] = Yes3(f(value))
}

object zad3 {
  def parseIntAsListStr(a: Int): List[String] = List(a.toString, a.toString)

  def main(args: Array[String]): Unit = {
    val no = No3()
    val yes = Yes3(4)
    val modifiedNo = no.applyFunction(parseIntAsListStr)
    val modifiedYes = yes.applyFunction(parseIntAsListStr)

    println(yes)
    println(no)

    println(modifiedNo)
    println(modifiedYes)
  }
}