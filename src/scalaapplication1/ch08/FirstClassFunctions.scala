package scalaapplication1.ch08

class FirstClassFunctions {

  def getIncreaseFunctionLiteral() {
    var increase = (x: Int) => x + 1
  }
}
