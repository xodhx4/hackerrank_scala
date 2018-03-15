def f(arr:List[Int]):Int = {
    def helper(remainArr: List[Int], count: Int): Int = {
        remainArr match {
            case Nil => count
            case x::xs => helper(xs, count+1)
        }
    }
    helper(arr, 0)
}
