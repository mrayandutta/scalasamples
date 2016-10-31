package scalasamples.basics

object Inheritance
{
	//Create a base class
	class BaseCalculator(brand: String)
	{
	  /**
	   * A constructor.
	   */
	  val color: String = if (brand == "TI")
	  {
	    "blue"
	  }
	  else
	  	if (brand == "HP")
		  {
		    "black"
		  }
		  else
		  {
		    "white"
		  }
	
	  // An instance method.
	  def add(m: Int, n: Int): Int = m + n
	}
	//Inheritance example
	class ScientificCalculator(brand: String) extends BaseCalculator(brand)
	{
  	def log(m: Double, base: Double) = math.log(m) / math.log(base)
	}
	//Overloading methods
	class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand)
	{
  	def log(m: Int): Double = log(m, math.exp(1))
	}
}