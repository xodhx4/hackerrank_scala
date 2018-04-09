object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
           a(a_i) = sc.nextInt();
        }
        // Write Your Code Here
        val numSwaps = bubbleSort(a, n)
        println(s"Array is sorted in $numSwaps swaps.")
        val firstElement = a(0)
        val lastElement = a(n-1)
        println(s"First Element: $firstElement")
        println(s"Last Element: $lastElement")
    }
    
    
    
    def bubbleSort(a: Array[Int], n: Int): Int = {
        def ascending(Index: Int, num: Int): Int = {
            if (Index==n-1) {
                num
            }
            else {
                if (a(Index) > a(Index+1)) {
                    val numDif = swap(Index, num)
                    val change =  ascending(Index+1, numDif)    
                    change
                }
                else {
                    val change = ascending(Index+1, num)
                    change
                }              
            }
        }
        def swap(index: Int, numCh: Int): Int = {
            val temp = a(index)
            a(index) = a(index+1)
            a(index+1) = temp
            val numChDif = numCh + 1
            numChDif
        }
        def bubbleSortHelper(n: Int, finFlag: Int, num: Int): Int = {
            if (finFlag==1) {
                num
            }
            else {
                val ascendingNum = ascending(0, 0)
                if (ascendingNum==0){
                    val numPlus = bubbleSortHelper(n, 1, num)
                    numPlus
                }
                else {
                    val numPlus = bubbleSortHelper(n, 0, num+ascendingNum)
                    numPlus
                }
            }
        }
        val numSwaps = bubbleSortHelper(n, 0, 0)
        numSwaps
    }
}
