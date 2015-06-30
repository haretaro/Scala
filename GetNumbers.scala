object GetNumbers extends App{
  def GetNumbers() : List[Int] = {
    val s = readLine
    if(s==""){
      return List()
    }else{
      list = GetNumbers
      return (s toInt) :: list
    }
  }
  var list = GetNumbers
  println(list)
}
