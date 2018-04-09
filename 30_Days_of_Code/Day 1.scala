object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "		
        // Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        import scala.io.StdIn
        val int_num = StdIn.readLine()
        val double_num = StdIn.readLine()
        val string_s = StdIn.readLine()
        // Print the sum of both the integer variables
        println(i.toInt + int_num.toInt)
        println(d.toDouble + double_num.toDouble)
        println(s + string_s)
        // Print the sum of both the double variables
        
        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
    }
}