package Classes
import scala.util.Random
abstract class UserTemplate (name:String = "-",surname:String = "-",age:String = "-",username:String = "-",email:String = "-",password:String = "-"){
  protected var random = new Random()
  protected var _fiatWalet = 300d;
  protected var _tokenWalet = 125.0d;
  protected var _name: String = name;
  protected var _surname: String = surname;
  protected var _age: String = age;
  protected var _email: String = email;
  protected var _greedy = random.between(1,5)

  override def toString : String = s"${name} ${surname} | Fiat: ${_fiatWalet} | Tokens: ${_tokenWalet}"
  def buyTokens(payment:Double): Boolean ={TokenExchange.sellToken(this)}
  def sellToken(): Unit ={

  }
  def getTokens(tokens:Double): Unit ={
    _tokenWalet += tokens
  }

  def Age: String = _age
}
