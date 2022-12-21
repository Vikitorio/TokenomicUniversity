package Classes

import scala.io.StdIn.readLine
class Simulation() {
 private var _defCoach: Coach = new Coach()
  _defCoach.createOffice()
def addDefaultChars(): Unit ={
  var stu1 = new Student("Viktor", "M345_23")
  var stu2 = new Student("Viktoria", "chorna_1")
  var stu3 = new Student("Nika", "volovic4k")
  var stu4 = new Student("gukir", "M345_23")
  var stu5 = new Student("piktoria", "chorna_1")
  var stu6 = new Student("Nidddka", "volovic4k")
  _defCoach.get_office.addStudent(stu1)
  _defCoach.get_office.addStudent(stu2)
  _defCoach.get_office.addStudent(stu3)
  _defCoach.get_office.addStudent(stu4)
  _defCoach.get_office.addStudent(stu5)
  _defCoach.get_office.addStudent(stu6)
}
  def simulateOfficePeriod(taskCount:Int): Unit ={
    addDefaultChars()
    for(i<-1 to taskCount){
      _defCoach.get_office.makeTask()
      println(s"---Period ${i}---")
      println(_defCoach.get_office + "\n")
      readLine()
    }
  }
}
