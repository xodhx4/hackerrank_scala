object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        val end = multiply(n, 1)
    }
    
    def multiply(n: Int, i: Int): Int = {
        val result = n*i
        println("%d x %d = %d".format(n, i, result))
        val next_i = i+1
        next_i match {
            case i if i <= 10 => multiply(n,next_i)
            case _ => result
        }
        
    }
}
