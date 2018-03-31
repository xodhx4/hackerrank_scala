def f(arr:List[Int]):List[Int] = {
    arr.map((x: Int) => (if (x < 0) -x else x))
}