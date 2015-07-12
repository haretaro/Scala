case class Node[+T](head:T, tail:Node[T])

class MyList[T](elements:T*){
  val head = cons(0)
  val length = elements length

  private def cons(n:Int) : Node[T] = {
    if(elements isDefinedAt(n+1)){
      Node( elements(n), cons(n+1))
    }else{
      Node( elements(n),null)
    }
  }

  def apply(n:Int) : T = {
    var node = head
    for( i <- 1 to n){
      node = node tail
    }
    node.head
  }

  override def toString() : String = {
    def buildString(node:Node[T]) : String = {
      if(node.tail == null){
        node.head.toString
      }else{
        node.head.toString + ", " + buildString(node.tail)
      }
    }
    '['+buildString(head)+']'
  }
}

object Main extends App{
  val list = new MyList(42,43,44,45,56,120)
  println(list)
  println(list(2))
  println(list length)
}
