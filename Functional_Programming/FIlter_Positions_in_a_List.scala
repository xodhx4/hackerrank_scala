def f(arr:List[Int]):List[Int] = {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val evenArr = arr
        .zipWithIndex
        .collect {
            case (vali, ind) if (ind%2==1) => vali
        }
                        
    
    evenArr
}
