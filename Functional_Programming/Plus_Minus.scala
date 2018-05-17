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

    // Complete the plusMinus function below.
    def plusMinus(arr: Array[Int]) {
        val total: Double = arr.length
        val pos = arr.filter((i: Int) => i > 0).length / total
        val neg = arr.filter((i: Int) => i < 0).length / total
        val zero = arr.filter((i: Int) => i == 0).length / total
        println(f"$pos%1.6f")
        println(f"$neg%1.6f")
        println(f"$zero%1.6f")
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        plusMinus(arr)
    }
}
