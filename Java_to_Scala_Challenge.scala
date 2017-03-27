class Calculator{
	def add(c:Int, d:Int) = c+d
	def quotient(c:Int, d:Int){
	if(d==0) 
		println("Cannot divide by 0") 
	else 
		println(c/d)
	}
	def multiply(c:Int, d:Int) = c*d
	def subtract(c:Int, d:Int) = c-d
}

var calc = new Calculator
val a = 10
var b = 5
println(calc.add(a,b))
calc.quotient(a,b)
b = 0
calc.quotient(a,b)
b = 5
println(calc.subtract(a,b))
println(calc.multiply(a,b))