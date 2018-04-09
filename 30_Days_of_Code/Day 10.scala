object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        val str = n.toBinaryString
        var max = 0
        var seq = 0
        for (cha <- str) {
            if (cha == '1') seq = seq+1
            else seq = 0
            if (seq > max) max = seq
        }
        println(max)
    }
    
}
