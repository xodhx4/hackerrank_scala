object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        calPoint(a0, a1, a2, b0, b1, b2)
    }
    def calPoint(a0: Int, a1: Int, a2: Int, b0: Int, b1: Int, b2: Int): Unit = {
        def helper(a: Int, b: Int, curPoint: List[Int]): List[Int] = {
            if (a > b) List(curPoint(0)+1, curPoint(1))
            else if (a == b) curPoint
            else List(curPoint(0), curPoint(1)+1)
        }
        val first = helper(a0, b0, List(0,0))
        val second = helper(a1, b1, first)
        val last = helper(a2, b2, second)
        last.foreach{i => print(s"$i ")}
    }
}