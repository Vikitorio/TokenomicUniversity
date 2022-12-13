import Classes.Student
import Classes.StudentList

object Main {
  def main(args: Array[String]): Unit = {
    var stu1 = new Student("Viktor","M")
    stu1.getNewGrade()
    stu1.getNewGrade()
    var stu2 = new Student("Viktoria","Chorna")
    stu2.getNewGrade()
    stu2.getNewGrade()
    var stu3 = new Student("Nika","Volovic")
    stu3.getNewGrade()
    stu3.getNewGrade()
    var listtest : StudentList = new StudentList()
    listtest.addStudent(stu1)
    listtest.addStudent(stu2)
    listtest.addStudent(stu3)

    println(listtest)
    listtest.sortByGrades()
    println("\n",listtest)

  }
}