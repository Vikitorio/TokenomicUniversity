package Classes
class Office(coach:Coach){
  private var _coach = coach
  private val _students:StudentList = new StudentList()
  private var defaultTaskPrice:Double = 100d
  private var _income:Double = 0d
  private var _studentsCount: Int = 0
  override def toString:String = {
    var str:String = s"Income: ${_income} StudentsCount: ${_studentsCount}\n"
    str +="sad"+ studentsToStr()
    return  str
  }
  def studentsToStr(): String ={
    var str = ""
    for(i <- _students.list){
      str += i.toString + "\n-----------------\n"
    }
    return str
  }
  
  def sortByGrades(): Unit ={
    _students.sortByGrades()
  }
  def removeStudent(login:String): Unit ={
    _students.list.filter(_.get_login == login)
  }
  private  def giveGrades(): Unit ={
    for (i <- _students.list) {
      i.set_grade()
    }
  }
 private def giveTokensForTask(): Unit ={
    var list = _students.list
    for (i <- _students.list.indices) {
        if (i < (list.length*0.1)) {
          list(i).addTokens(defaultTaskPrice * 1.2)
        }
        else if (i < (list.length*0.2))  list(i).addTokens(defaultTaskPrice*1.1)
        else if (i < (list.length*0.4))  list(i).addTokens(defaultTaskPrice*1.0)
        else if (i < (list.length*0.2)) list(i).addTokens(defaultTaskPrice*0.85)
        else if (i < (list.length*0.1))  list(i).addTokens(defaultTaskPrice*0.75)
        else list(i).addTokens(defaultTaskPrice*0.75)


    }
  }
  def makeTask(): Unit ={
    for(i <- _students.list){
      if (!i.checkBalance(defaultTaskPrice)) {
        removeStudent(i.get_login)
      }
      else {
        i.getPayment(defaultTaskPrice)
        _income += defaultTaskPrice
        coach.addTokens(defaultTaskPrice)
      }
    }
    giveGrades()
    sortByGrades()
    giveTokensForTask()
  }
    def list: StudentList = _students
}
