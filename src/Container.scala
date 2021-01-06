case class Container[A](private val value: A)
{

  def getContent: A = value

  def applyFunction[R](f: A => R): Container[R] = Container(f(value))
}

object zad1 {

  def parseIntAsListStr(a: Int): List[String] = List(a.toString, a.toString)

  def main(args: Array[String]): Unit = {
    val c = Container(21)
    println(c.getContent)
    val cModified = c.applyFunction(parseIntAsListStr)
    println(cModified.getContent)
  }
}
