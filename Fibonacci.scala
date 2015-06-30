object Fibonacci extends App{
  def makeFibonacci() : (Int => BigInt)= {
    var memo = scala.collection.mutable.Map[Int,BigInt](1->BigInt(1),2->BigInt(1))
    return ( n => memo getOrElseUpdate(n,memo(n-1)+memo(n-2)))
  }

  val fibonacci = makeFibonacci

  for (i <- 1 to 100)
    println( fibonacci(i) )


  
}
