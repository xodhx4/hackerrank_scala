object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = Array.ofDim[Int](6,6);
        for(arr_i <- 0 to 6-1; arr_j <- 0 to 6-1) {
            arr(arr_i)(arr_j) = sc.nextInt()
        }
        println(find_max(arr))
        
    }
    def cal_sum(arr: Array[Array[Int]], init: (Int,Int)): Int = {
        var sum = 0
        for (x <- init._1 to init._1 + 2; y <- init._2 to init._2 + 2) {
            sum += arr(x)(y)
        }
        sum -= arr(init._1 + 1)(init._2)
        sum -= arr(init._1 + 1)(init._2 + 2)
        sum
    }
    def find_max(arr:Array[Array[Int]]): Int = {
        def find_max_help(arr:Array[Array[Int]], init: (Int, Int), max: Int): Int = {
            init._1 match {
                case i if i < 4 => init._2 match {
                    case j if j < 4 => if (cal_sum(arr, (i,j)) > max) find_max_help(arr, (i, j+1), cal_sum(arr, (i,j))) else find_max_help(arr, (i, j+1), max)
                    case _ => find_max_help(arr, (i+1, 0), max)
                }
                case _ => max
            }
        }
        find_max_help(arr, (0,0), -56)
    }
}
