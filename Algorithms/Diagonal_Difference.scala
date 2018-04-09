import java.io.PrintWriter

object Solution {

    /*
     * Complete the diagonalDifference function below.
     */
    def diagonalDifference(a: Array[Array[Int]], size: Int): Int = {
        /*
         * Write your code here.
         */
        def diagonalDifferenceHelper(index: Int, leftDia: Int, rightDia: Int): (Int, Int) = {
            index match {
                case i if i >= size => (leftDia, rightDia)
                case _ => diagonalDifferenceHelper(index+1, leftDia + a(index)(index), rightDia + a(index)(size-1-index))
            }
        }
        val (left, right) = diagonalDifferenceHelper(0, 0, 0)
        
        if (left > right) left-right
        else right-left

    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = scan.readLine.trim.toInt

        val a = Array.ofDim[Int](n, n)

        for (aRowItr <- 0 until n) {
            a(aRowItr) = scan.readLine.split(" ").map(_.trim.toInt)
        }

        val result = diagonalDifference(a, n)

        fw.println(result)

        fw.close()
    }
}
