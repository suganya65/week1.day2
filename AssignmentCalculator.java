package week1.day2;

public class AssignmentCalculator {
	
		public int add (int num1, int num2, int num3) {
		//int sum = num1+num2+num3;
		return (num1+num2+num3);
	}
		
	public int sub(int num1, int num2) {
		return (num1-num2);
	}
	
	public double mul(double num1, double num2) {
		return (num1*num2);
	}
	
	public double divide(float num1, float num2) {
		return (num1/num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignmentCalculator Calculator = new AssignmentCalculator();
		System.out.println("Sum is " + Calculator.add(9, 2, 3));
		System.out.println("Substration is " + Calculator.sub(9, 2));
		System.out.println("Multiplication is " + Calculator.mul(123,222));
		System.out.println("Substration is " + Calculator.divide(145, 12));
	}

}
