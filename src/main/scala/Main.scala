import Classes.Student

object Main {
  def main(args: Array[String]): Unit = {
    var stu1 = new Student()
    var listtest : List[Student] = Nil

    listtest = stu1::listtest

    println(listtest)
  }
}