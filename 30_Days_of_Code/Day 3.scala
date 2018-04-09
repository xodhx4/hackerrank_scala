object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var N = sc.nextInt();
        N match {
            case i if i%2==1 => println("Weird")
            case i if (i>=6 && i<=20) => println("Weird")
            case _ => println("Not Weird")
        }
    }
}
