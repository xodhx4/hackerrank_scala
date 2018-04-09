import java.io.PrintWriter

object Solution {

    /*
     * Complete the aVeryBigSum function below.
     */
    def aVeryBigSum(n: Int, ar: Array[Long]): Long = {
        /*
         * Write your code here.
         */
        def aVeryBigSumHelper(index: Int, sum: Long): Long = {
            index match {
                case i if i < n => aVeryBigSumHelper(index+1, sum + ar(index))
                case i if i >= n => sum
            }
        }
        
        aVeryBigSumHelper(0, 0)

    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = scan.readLine.trim.toInt

        val ar = scan.readLine.split(" ").map(_.trim.toLong)
        val result = aVeryBigSum(n, ar)

        fw.println(result)

        fw.close()
    }
}
