object FizzBuzz extends App{
	
	def fizzBuzz( n:Int ): String = {
		if (n%3==0 && n%5==0){
			return "FizzBuzz"
		}else if(n%3==0){
			return "Fizz"
		}else if(n%5==0){
			return "Buzz"
		}else{
			return n.toString()
		}
	}

	print((1 to 100).map(fizzBuzz).mkString(" "))
}
