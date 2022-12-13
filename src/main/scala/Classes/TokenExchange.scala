package Classes

object TokenExchange{
  private var _tokentBank = 1000000.0d
  private var _fiatBank = 1000000.0d
  private var _currentPrice :Double = 0.1d

  def TokenBank: Double = _tokentBank
  def FiatBank:Double= _fiatBank
  def sellToken(User:UserTemplate): Boolean = {return false}
}
