trait Maybe2[A]
case class No2() extends Maybe2[Nothing]
case class Yes2[A](value: A) extends Maybe2[A]

object zad2 {
  def main(args: Array[String]): Unit = {
    val no = No2()
    val yes = Yes2(4)
    println(no.isInstanceOf[Maybe2[_]])
    println(yes.isInstanceOf[Maybe2[_]])
  }
}