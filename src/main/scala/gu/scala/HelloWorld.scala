package gu.scala

/**
 * import multiple classes in the same package using .{class1, class2}
 */
import java.lang.{String,StringBuffer}

/**
 * import a whole package
 */
import java.io.File

class HelloWorld(firstName: String, lastName: String) {

  def morning(age: Int) {
    println(s"Good Morning, $firstName $lastName, you are $age years old")
  }

  /**
   * create a method that returns
   * def functionName ([list of parameters]) : [return type]
   * def functionName ([list of parameters]) : [return type] = {
   * function body
   * return [expr]
   * }
   * return is not required... whatever the last value in the function
   */
  def getFullName(): String = {
    s"$firstName $lastName"
    return "this is the final return"
  }
  
  def readFile(filePath:String) = {
    var bSrc =  io.Source.fromFile(filePath, "UTF-8")
  }
   
//   def using(io.Source.fromFile("example.txt")) { source => {
//        for (line <- source.getLines) {
//            println(line)
//        }
//    }}
}

object Hello {
  def main(args: Array[String]) {
    var helloWorld = new HelloWorld("Steve", "Gu")
    helloWorld.morning(25)
    println(helloWorld.getFullName());
  }

}