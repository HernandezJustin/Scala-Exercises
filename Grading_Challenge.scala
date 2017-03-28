object challenge {
  
  def main(args: Array[String]){
  	var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
  	for(grade <- grades) {
  		if (grade <= 100 && grade > 92){
  			println("For a score of " + grade + " the submitter receives an A")
  		}
  		else if (grade <= 92 && grade >= 86){
  			println("For a score of " + grade + " the submitter receives an B")
  		}
  		else if (grade <= 85 && grade >= 77){
  			println("For a score of " + grade + " the submitter receives an C")
  		}
  		else if (grade <= 76 && grade >= 69){
  			println("For a score of " + grade + " the submitter receives an D")
  		}
  		else{
  			println("For a score of " + grade + " the submitter receives an F")
  		}
  	}
  	average(grades)
  }  

  def average(gList:List[Int]) {
  	var counter:Double = 0.0
  	for(grade <- gList) yield(counter += grade)
  	val avg = counter / gList.length
  	println("The average is " + avg)
  }
} 