package Classes

class StudentList {
  private var _list:List[Student] = Nil
  def addStudent(tStudent:Student): Unit = {
    _list = tStudent :: _list
  }
  def sortByGrades(): Unit ={_list = _list.sortWith(_>_) }
  def list: List[Student] = _list
}
