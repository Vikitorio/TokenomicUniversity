package Classes

class StudentList {
  private var _list:List[Student] = List()
  def addStudent(tStudent:Student): Unit ={
    _list = tStudent::_list
  }
  def sortByGrades(): Unit ={
    var temp:Student = new Student()
    for(i <- _list){
      for (sort <- 0 until _list.length) {
        if(_list(sort) > _list(sort+1)){
          temp = _list(sort)
          _list.updated(sort,_list(sort+1))
          _list.updated(sort+1,temp)
        }

      }
    }
  }
}
