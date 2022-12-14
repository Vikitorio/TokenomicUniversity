package Classes

object TokenExchange {
  private var _tokenBank = 1000000.0d
  private var _fiatBank = 1000000.0d
  private var _currentPrice: Double = 0.1d
  private var _minPrice: Double = 0.1d
  private var _maxPrice: Double = 5d
  private var _oneTokenChange = 0.01d
  private var _sellStack:Double = 0d
  private var _buyStack:Double = 0d


  def sellTokens(user: UserTemplate, amount: Double): Boolean ={
    user.set_tokenBalance(user.get_tokenBalance - amount)
    user.set_fiatBalance(user.get_fiatBalance + (amount * _currentPrice))
    _currentPrice -= amount * _oneTokenChange
    _sellStack += amount
    priceSupport()
    return true
  }
  def buyTokens(user: UserTemplate, amount: Double): Boolean = {
    if (user.get_fiatBalance / _currentPrice < amount) {
      return false}
    user.set_fiatBalance(user.get_fiatBalance - (amount * _currentPrice))
    user.set_tokenBalance(user.get_tokenBalance + amount)
    _currentPrice += amount * _oneTokenChange
    _buyStack += amount
    priceSupport()
    return true
  }
  def updatePrice(): Unit ={
    if(_sellStack !=0 && _buyStack != 0) {
      _currentPrice *= _buyStack / _sellStack
      priceSupport()
    }
  }
  def priceSupport(): Unit ={
    if(_currentPrice<_minPrice) {
      var priceDifference = _minPrice - _currentPrice
      _tokenBank += priceDifference / _oneTokenChange
      _fiatBank -= (priceDifference / _oneTokenChange)* ((_currentPrice + _minPrice)/2)
    }
    else if (_currentPrice > _maxPrice) {
      var priceDifference =  _currentPrice - _maxPrice
      _tokenBank -= priceDifference / _oneTokenChange
      _fiatBank += (priceDifference / _oneTokenChange) * ((_currentPrice + _minPrice) / 2)
    }
  }
  def addTokens(amount:Double): Unit ={
    _tokenBank += amount
  }
  def TokenBank: Double = _tokenBank
  def FiatBank: Double = _fiatBank
  def CurrentPrice:Double = _currentPrice
}