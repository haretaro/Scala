object Fibonacci extends App{

  def makeFibonacci() : (Int => BigInt)= {
    var memo = scala.collection.mutable.Map[Int,BigInt](1->BigInt(1),2->BigInt(1))
    def fibonacci(n:Int) : (BigInt) = memo getOrElseUpdate(n,fibonacci(n-1)+fibonacci(n-2))
    fibonacci
  }

  val fibonacci = makeFibonacci
  println( fibonacci(10))
  for (i <- 1 to 100)
    println( fibonacci(i) )
}
