package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-- Create another class as MyCalculator and call all the methods from Calculator and print the results
		
		AssignmentCalculator calc = new AssignmentCalculator();
		System.out.println("Sum is " + calc.add(9, 2, 3));
		System.out.println("Substration is " + calc.sub(9, 2));
		System.out.println("Multiplication is " + calc.mul(123,222));
		System.out.println("Substration is " + calc.divide(145, 12));

	}

}
