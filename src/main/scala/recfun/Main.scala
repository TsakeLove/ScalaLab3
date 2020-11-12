package recfun
import Huffman._

object Main {

  def main(args: Array[String]): Unit = {
    println(convert(frenchCode))
    println(quickEncode(frenchCode)(decodedSecret))
  }
}
