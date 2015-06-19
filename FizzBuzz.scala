object FizzBuzz extends App{
	
	def fizzBuzz( n:Int ): String = n match{
		case n if n%15==0 => "FizzBuzz"
		case n if n%3==0 => "Fizz"
		case n if n%5==0 => "Buzz"
		case _ => n.toString()
	}

	print((1 to 100).map(fizzBuzz).mkString(" "))
}
