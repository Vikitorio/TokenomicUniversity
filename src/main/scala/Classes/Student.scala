package Classes
import scala.util.Random
class Student(name:String = "-",surname:String = "-",age:String = "-",username:String = "-",email:String = "-",password:String = "-") extends UserTemplate(name,surname,age,username,email,password){
  private var _grade:Int = 0
  override def toString: String = s"${name} ${surname} | Fiat: ${_fiatBalance} | Tokens: ${_tokenBalance}| Grade: ${_grade}"
  def getNewGrade(): Unit = _grade = random.between(1,100)
  def >(other:Student):Boolean = {this.Grade > other.Grade}

  def Grade: Int = _grade

}
