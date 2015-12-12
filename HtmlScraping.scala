import scala.io.Source
import scala.util.matching.Regex

object Html{

  def getSource(url: String) = {
    val src = Source.fromURL(url, "ISO-8859-1").getLines.toList
    println(src)
  }

}

object Main extends App{
  Html.getSource("http://hoge.com")
}
