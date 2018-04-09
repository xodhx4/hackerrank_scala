object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
        */
        import scala.io.StdIn
        val num = StdIn.readInt()
        recu_print(num)
        
        def recu_print(num: Int): Unit ={
            if (num < 1) {}
            else {
                val sentence = StdIn.readLine()
                print_even(sentence, 0)
                print_odd(sentence, 1)
                recu_print(num-1)
            }
            
            
            def print_even(sentence: String, index: Int): Unit = {
                if (sentence.length() > index) {
                    print(sentence.charAt(index))
                    print_even(sentence, index+2)
                }
                else print(' ')
            }
            
            def print_odd(sentence: String, index: Int): Unit = {
                if (sentence.length() > index) {
                    print(sentence.charAt(index))
                    print_odd(sentence, index+2)
                }
                else println()
            }
        }
    }
}