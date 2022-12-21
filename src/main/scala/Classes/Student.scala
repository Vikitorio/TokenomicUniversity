package Classes

class Student(login:String = "",password:String = "",name:String = "-",surname:String = "-",age:String = "-",username:String = "-",email:String = "-") extends UserTemplate(login,password,name,surname,age,username,email){
  private var _lastGrade:Int = 0
  private var _allGrades:List[Int] = List()
  private var _courseSubscription:Office = _
  override def toString: String = s"${_login}  ${_password} | Fiat: ${_fiatBalance.round} | Tokens: ${_tokenBalance.round}| Grade: ${_lastGrade}"

  def >(other:Student):Boolean = {this._lastGrade > other.grade}
  def <(other:Student):Boolean = {this._lastGrade < other.grade}

  def getPayment(amount:Double):Double = {
    if(amount < _tokenBalance) {
      _tokenBalance -= amount
      return amount
    }
    else if(buyTokens(amount - _tokenBalance)) {
      _tokenBalance -= amount
      return amount
    }
    return 0
  }
  def grade: Int = _lastGrade
  def set_grade(): Unit = {
    var newGrade: Int = _random.between(1, 100)
    _allGrades = newGrade :: _allGrades
    _lastGrade = newGrade
  }
}
