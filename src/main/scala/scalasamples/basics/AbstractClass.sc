package scalasamples.basics

object AbstractClass
{
  abstract class Shape
  {
     def getArea():Int    // subclass should define this
  }
  class Circle(r: Int) extends Shape
  {
     def getArea():Int = { r * r * 3 }
  }
  ///val s = new Shape //Uncomment to check message class Shape is abstract; cannot be instantiated
  val c = new Circle(2)                           //> c  : scalalearning.basics.AbstractClass.Circle = scalalearning.basics.Abstra
                                                  //| ctClass$Circle@aec6354
}