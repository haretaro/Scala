import java.io.BufferedReader
import java.io.InputStreamReader

object ShowNumbers extends App{
  val com = new BufferedReader(new InputStreamReader(System.in))
  var n = 1
  while(com.ready()==false){
    println(n)
    n = n+1
  }
}
