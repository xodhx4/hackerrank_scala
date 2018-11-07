object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        import scala.annotation.tailrec
        val sc = new java.util.Scanner(System.in)
        val msg = sc.next()
        // println(msg)
        val answer = encoding(msg.toList, 1, 0.toChar, "")
        println(answer)
        
    }
    @annotation.tailrec
    def encoding(inputString: List[Char], conti: Int, orderChar: Char, outputString: String): String = {
        inputString match {
            case x::xs => 
                if (x == orderChar) encoding(xs, conti+1, orderChar, outputString)
                else if (conti == 1) encoding(xs, 1, x, outputString+x)
                else encoding(xs, 1, x, outputString + conti.toString + x)
            case Nil =>
                if (conti == 1) outputString
                else outputString + conti.toString
                
        }
    }
}