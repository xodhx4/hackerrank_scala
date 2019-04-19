// This function will be used while invoking "Summation" to compute
 // The area under the curve.
 def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
	{
		//Fill Up this function body
     	// To compute the value of the function
        // For the given coefficients, powers and value of x
        coefficients.zip(powers).foldLeft(0.0)((sum:Double, term:(Int, Int)) => sum + term._1*scala.math.pow(x, term._2))
	}

  // This function will be used while invoking "Summation" to compute 
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients:List[Int],powers:List[Int],x:Double):Double = 
	{
		//Fill Up this function body
     	// To compute the area of the circle on revolving the point
      	// (x,f(x)) around the X-Axis
        // For the given coefficients, powers and value of x
        val fx:Double = f(coefficients, powers, x)
        scala.math.Pi * fx * fx
	}

	// This is the part where the series is summed up
	// This function is invoked once with func = f to compute the area 	     // under the curve
    // Then it is invoked again with func = area to compute the volume 
    // of revolution of the curve
   def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double =
	{
		// Fill up this function
        def cal(sum: Double, cur: Double): Double =
        {
            cur match {
                case i if i > upperLimit =>
                    sum
                case _ =>
                    val newSum:Double = sum + 0.001*func(coefficients, powers, cur)
                    cal(newSum, cur+0.001)
            }
        }
        cal(0, lowerLimit+0.001)
        
	}


// The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.
