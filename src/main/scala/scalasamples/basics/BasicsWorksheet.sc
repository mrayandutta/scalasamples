package scalasamples.basics

object BasicsWorksheet
{
  //Expressions
  10+40                                           //> res0: Int(50) = 50
  //Values
  val two = 1 + 2                                 //> two  : Int = 2
  //Variables
  var name = "Java"                               //> name  : String = Java
  name = "Scala"
  
  //Functions
  //Define a function to add one
  def addOne(m: Int): Int = m + 1                 //> addOne: (m: Int)Int
  //Call the function
  val three = addOne(2)                           //> three  : Int = 3
  
  //Create one Anonymous Functions and store it into a val
  val function1 = (x: Int) => x + 1               //> function1  : Int => Int = <function1>
  //Invoke the function
  function1(100)                                  //> res1: Int = 101
}