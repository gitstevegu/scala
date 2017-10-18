package gu.scala

/**
 * Everything in Scala is object, including functions. Therefore it is possible to pass functions as arguments, to stroe them
 * in variables, and to return them from other functions.
 * 
 * This ability to manipulate functions as values is one of the cornerstone of a very interesting programming paradigm
 * called functional programming.
 */
object Timer {
  
  
  
  def oncePerSecond(callback: () => Unit) {
    var count:Int = 0
    while (count < 20) {
      callback()
      Thread sleep 1000
      count = count + 1
    }
  }
  
  def timeFlies() {
    println("time flies like an arrow ...")
  }
  
  def main (args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}