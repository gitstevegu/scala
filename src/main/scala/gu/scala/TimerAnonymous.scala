package gu.scala

object TimerAnonymous {
  //use anonymous method
  
  def oncePerSecond(callback: () => Unit) {
    while (true) {callback(); Thread sleep 1000}
  }
  
  def main( args: Array[String]) {
    oncePerSecond( () => println("time flies in anonymous..."))
  }
}