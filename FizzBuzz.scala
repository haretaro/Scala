object FizzBuzz extends App{

	print(1 to 100 map(
		n => {
			n match{
				case n if n%15==0 => "FizzBuzz"
				case n if n%3==0 => "Fizz"
				case n if n%5==0 => "Buzz"
				case _ => n.toString()
			}
		}
	) mkString(" "))
}
