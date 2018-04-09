object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        import scala.io.StdIn
        
        def Iter(f:(Int) => Unit, count:Int): Unit = {
            if (count == 0) {}
            else {
                val num = StdIn.readInt()
                f(num)
                Iter(f, count-1)
            }
        }
        
        def isPrime(num:Int): Unit = {
            def isPrimeHelper(divNum: Int): Boolean = {
                divNum match {
                    case i if i >= num => true
                    case i if num%i != 0 => isPrimeHelper(divNum+2)
                    case i if num%i == 0 => false
                }
            }
            if (((num%2==0)&&(num!=2))||(num==1)) println("Not prime")
            else {
                if (isPrimeHelper(3) == true) println("Prime")
                else println("Not prime")
                
            }
        }
    
        val iterNum = StdIn.readInt()
        Iter(isPrime, iterNum)
    
        
    }
}