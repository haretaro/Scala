object Sort extends App{
  val list = List(1,3,5,4,2,0)
  println(list sorted)
  println(list sorted(Ordering[Int] reverse))
}
