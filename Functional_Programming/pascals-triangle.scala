object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val stdin = scala.io.StdIn
        val n = stdin.readInt
        pascal(n)
        
    }
    def pascal(n: Int): Unit = {
        def pascalLine(origin: List[Int], next: List[Int]): List[Int] = {
            origin match {
                case x::xs::Nil => 
                    val sum: Int = x + xs
                    1::sum::next
                case x::xs::xss =>
                    val sum: Int = x+xs
                    pascalLine(xs::xss, sum::next)
                case _ =>
                    List(1, 1)
            }
        }
        def pascalHelper(index: Int, arr:List[Int]): Unit = {
            arr.foreach((i: Int) => print(f"$i "))
            println()
            index match {
                case x if(x < n) =>pascalHelper(x+1, pascalLine(arr, 1::Nil))
            }
        }
        pascalHelper(1, List(1))
    }
}