package gu.scala

/**
 * An singleton object:  no parameters and cannot be instantiated.
 */
object HelloScala {
  def main(args: Array[String]) {
    println("Hello Scala !!!");
    // Numeric data type: Byte, Short, Int, Long, Float, Double
    // auto conversion from Byte, ,,, Double, not reverse order
    val x: Int = 10;
    val y: Double = x;
    println(y);

    //boolean
    val xB: Boolean = false;
    val yB: Boolean = !xB;
    println(yB);

    //CHAR
    val c: Char = 'C';
    val c1 = 'D';
    println(c);

    //Unit: define a function that doesn't return data.  similar to void method;
    val u = ();
    println(u);

    //variables: val, var, lavy val
    //val: immutable
    val str = "hello!";
    println(str);

    //var:  mutable
    var str1 = "hello, world";
    //can be reassigned
    str1 = " more";
    println(str1);

    //lazy val: calculated once, the first time it is accessed.  Only vals can be lazy variables.
    lazy val z = x * y;
    println(z);

    //Arrays: elements same type
    //declaration: option 1
    var countries = Array("China", "India", "USA");

    //declaration: option 2
    countries = new Array[String](3);
    countries(0) = "China";
    countries(1) = "Cndia";
    countries(2) = "USA";

    //loop an array, iterator guard/filter
    for (c <- countries if (c.startsWith("C"))) {
      println(c);
    }

    //can use {} for for
    for {i <- 0 to 2} {
      println(countries(i));
    }

    // if/else if/else block, just like java
    val n = 20;
    if (n > 0) {
      println(n + " is a positive number");
    } else {
      println(n + " is a negative number");
    }

    // match: switch in java
    n match {
      case 10 => println("number is 10");
      case _ => println("number is not 10");
    }

    val check = (n % 2 == 0) match {
      case true => "even";
      case false => "odd";
    }
    println(check);

    //nested iterator
    for {
      i <- 1 to 2
      j <- 1 to 3
    }  println(s"($i, $j)");
    
    //value binding
    for {
      country <- countries
      countryUpper = country.toUpperCase()
    } {
      println(countryUpper);
    }
    
    //yielding in for loop
    val filteredCountries = for {
      country <- countries
      if (country.startsWith("C"))
    } yield(country.toUpperCase());
    
    for ( c <- filteredCountries) {
      println(c);
    }
    
    
    //exception handling try/catch/finally
    //1. Scala does not have checked exceptions
    //2. exception pattern match
    try {
      println(countries(3));
    } catch {
      case a: java.lang.ArrayIndexOutOfBoundsException => println("index exception");
      case e: java.lang.Exception => println("exception");
    }
    
    //wrap try/catch
    val ex = try {
      println(countries(3));
    } catch {
      case a: java.lang.ArrayIndexOutOfBoundsException => "Index out of bounds";
      case _: Throwable => "Unknown exception";
    }
    println(ex);
  }

  /**
   * multiple defs in an object?
   */

  /**
   * Data Type:
   * 1. No primitive
   * 2. root: Any
   * 3. AnyVal: extends Any type: Numeric, Boolean, Char, Unit
   * 4. AnyRef: extends Any type: Classes, String, Collection
   *
   */
}