object Solution {
    import scala.io.StdIn
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        
        val num = StdIn.readInt()
        var book = collection.mutable.Map[String,String]()
        
        
        (1 to num) map (_ => book += tuplemake(StdIn.readLine()))
        
        val start = StdIn.readLine()
        iterprint(start, book)
                
    }
    def tuplemake(str: String): (String, String) = {
        val splitstr = str.split(" ")
        val tup= (splitstr(0), splitstr(1))
        tup
    }
    
    def printtuple(str: String, bookmap: collection.mutable.Map[String,String]) = {
        val number = bookmap.get(str)
        number match {
            case None => println("Not found")
            case Some(n) => println(s"$str=$n")
        }
            
    }
    
    def iterprint(str: String, bookmap: collection.mutable.Map[String,String]): Unit = {
        printtuple(str, bookmap)
        val next_str = StdIn.readLine()
        next_str match {
            case null => ()
            case _ => iterprint(next_str, bookmap)
        }
    }
}