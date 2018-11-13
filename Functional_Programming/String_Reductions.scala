object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val sc = new java.util.Scanner(System.in)
        val msg = sc.next()
        var index = Array.fill[Int](26)(0)
        def rec(input: List[Char], output: List[Char], ord: Array[Int]): List[Char] = {
            input match {
                case x::xs =>
                    val r:Int = x.toInt - 'a'.toInt
                    if (ord(r)==1) rec(xs, output, ord)
                    else {
                        ord(r)=1
                        rec(xs, x::output, ord)
                    }
                case Nil => output.reverse
            }
        }
        
        val answer = rec(msg.toList, Nil, index).mkString
        println(answer)
    }
}
