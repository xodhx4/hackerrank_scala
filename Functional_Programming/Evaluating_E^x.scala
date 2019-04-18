import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    def eval(x: Double, term:Int, sum:Double, top:Double, bottom:Int): Double = {
        term match {
            case i if (i<10) =>
                val newTop:Double = top*x
                val newBottom:Int = bottom * term
                val newSum:Double = sum + newTop/newBottom
                eval(x, term+1, newSum, newTop, newBottom)
            case _ =>
                sum
        }
    }


    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        for (nItr <- 1 to n) {
            val x = stdin.readLine.trim.toDouble
            println("%.3f".format(eval(x, 1, 1, 1, 1)))
        }
    }
}
