//Write your code here
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        List<Integer> div = new ArrayList<Integer>();
        for (int i=1; i < n+1; i++) {
            if (n%i == 0) {
                div.add(i);
            }
        }
        int sum = 0;
        for (Integer number: div) {
            sum += number;
        }
        return sum;
    }
}