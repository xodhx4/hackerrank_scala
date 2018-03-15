def f(num:Int,arr:List[Int]):List[Int] = {
    val x = arr.map(x => {
        (1 to num).map(_ => x).toList
    }).toList
    val result = x.flatten
    result
}
