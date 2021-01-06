trait Maybe4[+A] {
  def applyFunction[R](f: A => R): Maybe4[R]
  def getOrElse[R >: A](defaultValue: => R): R
}

case class No4() extends Maybe4[Nothing]{
  override def applyFunction[R](f: Nothing => R): Maybe4[R] = No4()

  override def getOrElse[R >: Nothing](defaultValue: => R): R = defaultValue
}

case class Yes4[A](value: A) extends Maybe4[A] {
  override def applyFunction[R](f: A => R): Maybe4[R] = Yes4(f(value))

  override def getOrElse[R >: A](defaultValue: => R): R = value
}

object zad4 {
  def parseIntAsListStr(a: Int): List[String] = List(a.toString, a.toString)

  def main(args: Array[String]): Unit = {
    val no = No4()
    val yes = Yes4(4)
    println(no.getOrElse(1))
    println(yes.getOrElse(1))
  }
}