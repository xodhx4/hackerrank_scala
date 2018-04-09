object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        import scala.io.StdIn
        val real = StdIn.readLine()
        val exp = StdIn.readLine()
        val realArray = real.split(" ").map(x => x.toInt)
        val expArray = exp.split(" ").map(x => x.toInt)
        val lateFee = calculateFee(realArray(0), realArray(1), realArray(2), expArray(0), expArray(1), expArray(2))
        println(lateFee)
    }
    def howDiff(real:Int, exp: Int): Int = {
        val diff = real - exp
        if (diff < 0) -1
        else diff
    }
    def calculateFee(realDay:Int, realMon:Int, realYear:Int, expDay:Int, expMon: Int, expYear: Int): Int = {
        val noLate = 0
        def calculateYearFee(): Int = {
            howDiff(realYear, expYear) match {
                case -1 => noLate
                case 0 => calculateMonthFee()
                case positive => 10000
            }
            
        }
        def calculateMonthFee(): Int = {
            howDiff(realMon, expMon) match {
                case -1 => noLate
                case 0 => calculateDayFee()
                case positive => positive*500
            }
        }
        def calculateDayFee(): Int = {
            howDiff(realDay, expDay) match {
                case -1 => noLate
                case 0 => noLate
                case positive => positive*15
                
            }
        }
        calculateYearFee()
        
    } 
    
}