package scalasamples.basics

object Types
{
  /*
  Functions can also be generic and work on any type. When that occurs, a type parameter
  can be introduced with the square bracket syntax.
  Following is an example of a Cache of generic Keys and Values.
  */
  
  trait Cache[K, V]
  {
  	def get(key: K): V
  	def put(key: K, value: V)
  	def delete(key: K)
	}
	
	//Cache cache = new Cache(Int,String)
}