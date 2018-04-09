object Solution {
    def main(args: Array[String]) {
        val t = io.StdIn.readInt
        
        for (_ <- 1 to t) {
            val nk = io.StdIn.readLine.split(" ").map(x => x.toInt)
            val n = nk(0)
            val k = nk(1)
            
            println(calMax(n, k))
            // write your code here
            
        }
    }
    def calMax(n: Int, k: Int): Int = {
        def cal(small: Int, big: Int): Int = {
            val andVal = small & big
            if (andVal >= k) 0
            else andVal
        }
        def calMaxIter(index:Int, curMax: Int): Int = {
            if (index > n) curMax
            else {
                if (curMax==k-1) curMax
                else {
                    val newMax = (1 to index-1).map(x => cal(x, index)).toList.max
                    if (newMax > curMax) calMaxIter(index+1, newMax)
                    else calMaxIter(index+1, curMax)
                }
            }
        }
        calMaxIter(2, 0)
    }
   
        

}
