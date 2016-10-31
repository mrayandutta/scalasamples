package scalasamples.basics

object ClassesWorksheet
{
	class Calculator
	{
      val brand: String = "HP"
      //Methods are just functions that can access the state of the class.
      def add(m: Int, n: Int): Int = m + n
      def multiply(m: Int, n: Int): Int = m * n
  }
  
  val calculator = new Calculator                 //> calculator  : scalalearning.basics.ClassesWorksheet.Calculator = scalalearni
                                                  //| ng.basics.ClassesWorksheet$Calculator@aec6354
  calculator.multiply(10, 20)                     //> res0: Int = 200
  calculator.brand                                //> res1: String = HP
  
  /**
  Constructor
	Constructors aren’t special methods, they are the code outside of method definitions in
	your class. Let’s extend our Calculator example to take a constructor argument and use it to
	initialize internal state.
  **/
  class CalculatorWithConstructor (brand: String)
	{
      /**
		   * A constructor.
		   */
		  val color: String = if (brand == "TI") {
		    "blue"
		  } else if (brand == "HP") {
		    "black"
		  } else {
		    "white"
		  }

  	// An instance method.
  	def add(m: Int, n: Int): Int = m + n
  }
  
  val calc1 = new CalculatorWithConstructor("HP") //> calc1  : scalalearning.basics.ClassesWorksheet.CalculatorWithConstructor = s
                                                  //| calalearning.basics.ClassesWorksheet$$anonfun$main$1$CalculatorWithConstruct
                                                  //| or$1@13969fbe
  val calc2 = new CalculatorWithConstructor("TI") //> calc2  : scalalearning.basics.ClassesWorksheet.CalculatorWithConstructor = 
                                                  //| scalalearning.basics.ClassesWorksheet$$anonfun$main$1$CalculatorWithConstru
                                                  //| ctor$1@6aaa5eb0
  calc1.color                                     //> res2: String = black
  calc2.color                                     //> res3: String = blue
   
  
}