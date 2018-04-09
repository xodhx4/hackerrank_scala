object Solution {
    
     def fibonacci(x:Int):Int = {
          
      // Fill Up this function body
        // You can add another function as well, if required
         def fibonacciHelper(index: Int, a: Int, b: Int): Int = {
             index match {
                 case 0 => a
                 case 1 => b
                 case _ => fibonacciHelper(index-1, b, a+b)
             }
         }
         
         fibonacciHelper(x-1, 0, 1)
     }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}
