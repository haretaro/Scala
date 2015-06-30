class MyList[T](elements:T*){
  val head = cons(0)
  val length = elements length

  private def cons(n:Int) : Node[T] = {
    if(elements isDefinedAt(n+1)){
      new Node( elements(n), cons(n+1))
    }else{
      new Node( elements(n),null)
    }
  }

  def apply(n:Int) : T = {
    var node = head
    for( i <- 1 to n){
      node = node next
    }
    node.data
  }

  override def toString() : String = {
    var node = head
    var str = "["
    while( node.next != null ){
      str += node.data.toString() + ", "
      node = node.next
    }
    str += node.data.toString() + ']'
    return str
  }
}

class Node[T](val data:T, val next:Node[T])

object Main extends App{
  val list = new MyList[Int](42,43,44,45,56,120)
  println(list)
  println(list(2))
  println(list length)
}
