package Classes
import scala.util.Random
abstract class UserTemplate (name:String = "-",surname:String = "-",age:String = "-",username:String = "-",email:String = "-",password:String = "-"){
  private var random = new Random()
  private var _FiatWalet = 300d;
  private var _TokenWalet = 125.0d;
  private var _name: String = name;
  private var _surname: String = surname;
  private var _age: String = age;
  private var _email: String = email;
  private var _greedy = random.between(1,5)
  def buyTokens(): Unit ={

  }
  def sellToken(): Unit ={

  }
  def getTokens(tokens:Double): Unit ={
    _TokenWalet += tokens
  }
  def >(other:UserTemplate):Boolean = {this.Age > other.Age}
  def Age = _age
}
