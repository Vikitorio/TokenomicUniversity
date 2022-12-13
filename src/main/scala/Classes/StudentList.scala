package Classes

class StudentList {
  private var _list:List[Student] = Nil
  def addStudent(tStudent:Student): Unit = {
    _list = tStudent :: _list
  }

  def sortByGrades(): Unit ={
    var temp:Student = new Student()
    for(i <- _list.indices){
      for (sort <-1 until _list.length) {
            println(_list(sort)>_list(sort-1))
      }
    }

  }
}
