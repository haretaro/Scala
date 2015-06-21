object Literals extends App{

	println("---Boolean---")
	println(true)
	println(false)

	println("---Int---")
	println(42)
	println(011) //deprecated
	println(0xff)

	println("---Long---")
	println(42L)
	println(011L) //deprecated
	println(0xffL)

	println("---Double---")
	println(1.0)
	println(1.) //deprecated
	println(1d)
	println(1e2)

	println("---Float---")
	println(1.0f)
	println(1f)
	println(1e2f)

	println("---Byte---")
	println(123:Byte)

	println("---Short---")
	println(123:Short)

	println("---BigInt---")
	println(123:BigInt)

	println("---BigDecimal---")
	println(1:BigDecimal)

	println("---String---")
	println("abc")
	println(
"""hoge
piyo""")

	println("---Char---")
	println('a')

	println("---Symbol---")
	println('symbol)

	println("---XML---")
	println(<marquee><blink>shine</blink></marquee>)

	println("---Unit---")
	println(())

	println("---Tuple1---")
	println(Tuple1(1))

	println("---Tuple2---")
	println((1,2))
	println(1->2)

	println("---Tuple3---")
	println((1,2,3))

	println("---Tuple4---")
	println((1,2,3,4))

	println("---Array---")
	println(Array(1,2,3) mkString(" "))

	println("---List---")
	println(List(1,2,3))
	
	println("---Set---")
	println(Set(1,2,3))

	println("---Map---")
	println(Map(1->"one",2->"two"))

	println("---function literal---")
	println(( (n:Int) => {n+1}:Int )(1))
	println(( (n:Int) => n+1 )(1))

	val test = (f:(Int)=>Int) => f(1)
	println(test( n=>n+1 ))
	println(test( _+1 ))
}
