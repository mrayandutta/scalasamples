package scalasamples.basics

object FunctionsWorksheet
{
	 //Partial application,You can partially apply a function with an underscore, which gives you another function.
 	def addTwoNumbers(n1: Int,n2: Int)  =(n1+n2)
                                                  //> addTwoNumbers: (n1: Int, n2: Int)Int
 	val add10More = addTwoNumbers(10, _:Int)  //> add10More  : Int => Int = <function1>
 	add10More(100)                            //> res0: Int = 110
 	
 	//Curried functions
 	def multiply(m: Int)(n: Int): Int = m * n //> multiply: (m: Int)(n: Int)Int
 	//Normal call
 	val m = multiply(10)(5)                   //> m  : Int = 50
 	//You can fill in the first parameter and partially apply the second.
 	val timesTwo = multiply(2) _              //> timesTwo  : Int => Int = <function1>
 	timesTwo(100)                             //> res1: Int = 200
 	
 	
 	//You can take any function of multiple arguments and curry it. Let’s try with our earlier adder

  val curriedAdd = (addTwoNumbers _).curried      //> curriedAdd  : Int => (Int => Int) = <function1>

	val addTwo = curriedAdd(50)               //> addTwo  : Int => Int = <function1>
	addTwo(5)                                 //> res2: Int = 55
	
	//Variable length arguments
	
	def capitalizeAll(args: String*) =
	{
	  args.map
	  { arg =>
	    arg.capitalize
	  }
	}                                         //> capitalizeAll: (args: String*)Seq[String]

 capitalizeAll("abcd", "xyz")                     //> res3: Seq[String] = ArrayBuffer(Abcd, Xyz)
  
}