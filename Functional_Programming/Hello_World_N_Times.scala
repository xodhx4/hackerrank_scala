def f(n: Int): Unit = {
        def helper(index: Int) : Unit = {
            if (index < n) {
                println("Hello World")
                helper(index+1)
            }
        }
        helper(0)
    }