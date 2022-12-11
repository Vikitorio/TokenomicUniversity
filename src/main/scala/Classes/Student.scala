package Classes
import scala.util.Random
class Student(name:String = "-",surname:String = "-",age:String = "-",username:String = "-",email:String = "-",password:String = "-") extends UserTemplate(name,surname,age,username,email,password){
  private var random = new Random()
  private var grades:List[Int] = Nil
  def setGrade(): Unit ={
    grades = random.between(1,100)::grades
  }
  def getGrades(): Unit ={

  }

}
