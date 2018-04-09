object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(n-1-arr_i) = sc.nextInt();
        }
        for (arr_i <- 0 to n-1) {
            print(arr(arr_i))
            print(" ")
        }
    }
}
