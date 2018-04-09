class Person {

    var age: Int = 0

    def this(initialAge:Int) = {
        // Add some more code to run some checks on initialAge
        this()
        if (initialAge < 0) {
            println("Age is not valid, setting age to 0.")
            age = 0
        }
        else age = initialAge
       
    }        

    def amIOld(): Unit = {
       // Do some computations in here and print out the correct statement to the console 
        age match {
            case i if i < 13 => println("You are young.")
            case i if i >= 18 => println("You are old.")
            case _ => println("You are a teenager.")
        }

    }

    def yearPasses(): Unit = {
        // Increment the age of the person in here
        age = age + 1
    }  

}