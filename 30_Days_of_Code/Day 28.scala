object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var N = sc.nextInt();
        var mutableList = scala.collection.mutable.ListBuffer.empty[(String, String)]
        (1 to N).foreach(_ => mutableList += ((sc.next(),sc.next())))
        val list = mutableList.toList
        val regex = raw"[a-z]+@gmail\.com".r
        
        def checkGmail(str: String): Boolean = {
            regex.findFirstIn(str) match {
                case Some(s) => true
                case None => false
            }
        }
        
        def clearList(inputList: List[(String, String)], outputList: List[String]): List[String] = {
            inputList match {
                case Nil => outputList
                case x :: xs if checkGmail(x._2) => clearList(xs, x._1 :: outputList)
                case x :: xs if !checkGmail(x._2) => clearList(xs, outputList)
            }
        }
        val initList = List[String]()
        val output = clearList(list, initList).sorted
        output foreach println
    }   
}
