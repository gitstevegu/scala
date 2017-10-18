package gu.scala

/**
 * class is the blueprint for object
 * class can have parameters, unlike java
 * all classes in Scala inherit from a super-class, scala.AnyRef, just as java.lang.Object in java
 */
class Complex(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
  
  //method without arguments can be declared without parenthesis
  //and they can be called without parenthesis
  def re2 = real
  def im2 = imaginary
  
  //override a method inherited from a super-class: mandatory keyword: override
  override def toString() = "" + re2 + (if (im < 0) "" else "+") + im + "i"
}

object TestComplex {
  
  def main(args:Array[String]) {
    val c = new Complex(1.2, -3.4)
    println(c)
  }
}