class MyList[T](elements:T*){
  val head = cons(0)
  val length = elements length

  def cons(n:Int) : Node[T] = {
    if(elements isDefinedAt(n+1)){
      new Node( elements(n), cons(n+1))
    }else{
      new Node( elements(n),null)
    }
  }

  def apply(n:Int) : T = {
    var node = head
    for( i <- 1 to n){
      node = node.next
    }
    node.data
  }
}

class Node[T](val data:T, val next:Node[T]){
}

object Main extends App{
  val list = new MyList("42","43","44","45","100")
  println(list(2))
  println(list length)
}
