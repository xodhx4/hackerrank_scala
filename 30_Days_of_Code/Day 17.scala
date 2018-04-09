//Write your code here
class Calculator {
    def power(n: Int, p: Int): Int = {
        val nu = n
        val po = p
        if ((nu < 0)||(po < 0)) throw new Exception("n and p should be non-negative")
        else scala.math.pow(nu,po).toInt
    }
}