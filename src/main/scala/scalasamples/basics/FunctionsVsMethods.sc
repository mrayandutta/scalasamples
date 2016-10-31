package scalasamples.basics

object FunctionsVsMethods
{
	class SampleClass
	{
        var counter = 0
        def methodForIncrement = { counter += 1 }
        val functionForIncrement = { () => counter += 1 }
  }
  
  val sampleClass = new  SampleClass              //> sampleClass  : scalalearning.basics.FunctionsVsMethods.SampleClass = scalale
                                                  //| arning.basics.FunctionsVsMethods$SampleClass@aec6354

	sampleClass.functionForIncrement          //> res0: () => Unit = <function0>
	sampleClass.methodForIncrement
}