package main.scala.scalasamples.basics

/**
  * Created by mrayandutta2016 on 12/25/2016.
  */
object ImplicitParam extends App {
  // define a method that takes an implicit String
  def greeting(implicit s: String) = println("Hello, " + s)

  // create an implicit String field, which is now "in scope"
  implicit val name = "Fred"
 // greeting

  implicit class StringImprovements(s: String) {
    def increment = s.map(c => (c + 1).toChar)
  }
  //print("HAL".increment)

  implicit def agentCodename(i: Int) = s"00$i"
  def hello(name: String) = s"Hello, $name!"
  hello(7)


}
