object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var meal_cost = sc.nextDouble();
        var tip_percent = sc.nextInt();
        var tax_percent = sc.nextInt();
        
        val cost = (100 + tip_percent + tax_percent) * meal_cost / 100

        println("The total meal cost is " + Math.round(cost) + " dollars.")
    }
}