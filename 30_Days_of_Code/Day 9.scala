object Solution {

    def factorial(n: Int, total: Int): Int =  {
        // Complete this function
        if (n==1) total
        else factorial(n-1, n*total)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        val result = factorial(n,1);
        println(result)
    }
}
