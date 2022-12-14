package Classes
import scala.util.Random
abstract class UserTemplate (name:String = "-",surname:String = "-",age:String = "-",username:String = "-",email:String = "-",password:String = "-"){
  protected var random = new Random()
  protected var _fiatBalance = 300d;
  protected var _tokenBalance = 125.0d;
  protected var _name: String = name;
  protected var _surname: String = surname;
  protected var _age: String = age;
  protected var _email: String = email;
  protected var _greed: Int = random.between(1, 5)

  override def toString : String = s"${name} ${surname} | Fiat: ${_fiatBalance} | Tokens: ${_tokenBalance}"
  def buyTokens(amount:Double): Boolean ={TokenExchange.buyTokens(this, amount)}

  def sellToken(amount: Double): Boolean = {
    if (TokenExchange.sellTokens(this, amount)) false
    true
  }
  def getTokens(tokens:Double): Unit ={
    _tokenBalance += tokens
  }

  def FiatBalance: Double = _fiatBalance
  def TokenBalance:Double = _tokenBalance
  def Name: String = _name
  def Surname: String = _surname
  def Age: String = _age
  def Email:String = _email
  def Greed:Int = _greed
}
