object Solution {
    
     def gcd(x: Int, y: Int): Int =
   {
		// You only need to fill up this function
        // To return the value of the GCD of x and y
       def sort(x: Int, y: Int): (Int, Int) = 
       {
           if (x > y) (x, y)
           else (y, x)
       }
       val (big, small) = sort(x, y)
       val remainder = big % small
       remainder match {
           case 0 => small
           case r => gcd(r, small)
       }

   }
  

/**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
		println(gcd(pair.head,pair.reverse.head))
  } 

    def main(args: Array[String]) {
/** The part relates to the input/output. Do not change or modify it **/
         acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

    }
}