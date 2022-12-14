package Classes

class Coach() extends UserTemplate(){
  private var _office: Office = _
  _fiatBalance = 1000
  def createOffice(): Unit ={
    //buyTokens(this,4000-_tokenBalance)
    //spentTokens(4000, this)
    _office = new Office(this)
  }
  def get_office: Office = _office
}
