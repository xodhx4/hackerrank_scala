def f(arr:List[Int]):List[Int] = {
    def f_helper(curList: List[Int], retList: List[Int]): List[Int] = {
        curList match {
            case Nil => retList
            case x::xs =>f_helper(xs, x :: retList)
        }
    }
    val startList = Nil
    f_helper(arr, startList)
}
