package Classes

import scala.util.Random
abstract class UserTemplate (login:String = "",password:String = "",name:String = "",surname:String = "",age:String = "",username:String = "",email:String = ""){
  protected val _random = new Random()
  protected val _login:String = login
  protected var _password:String = password
  protected var _fiatBalance = 300d;
  protected var _tokenBalance = 50d;
  protected var _name: String = name;
  protected var _surname: String = surname;
  protected var _age: String = age;
  protected var _email: String = email;
  protected var _greed: Int = _random.between(1, 5)

  override def toString : String = s"${_login} ${_password} | Fiat: ${_fiatBalance} | Tokens: ${_tokenBalance}"
  def buyTokens(amount:Double): Boolean =TokenExchange.buyTokens(this, amount)
  def sellTokens(amount: Double): Boolean = TokenExchange.sellTokens(this, amount)

  def checkBalance(amount: Double): Boolean = {
    return (amount < _tokenBalance + _fiatBalance / TokenExchange.CurrentPrice)
  }
  def spentTokens(amount:Double,user:UserTemplate): Unit = {
    if(amount > user._tokenBalance)  {
      user._tokenBalance -= amount
      TokenExchange.addTokens(amount)
    }

  }

  def addTokens(amount: Double): Unit = _tokenBalance += amount
  def get_fiatBalance:Double = _fiatBalance
  def set_fiatBalance(newValue: Double): Unit = {_fiatBalance = newValue}
  def get_tokenBalance:Double = _tokenBalance
  def set_tokenBalance(newValue:Double):Unit = {_tokenBalance = newValue}
  def get_login:String = _login
  def get_name: String = _name
  def get_surname: String = _surname
  def get_age: String = _age
  def get_email:String = _email
  def greed:Int = _greed
}
