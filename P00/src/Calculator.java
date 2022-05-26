
public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}
	public int divide1(int a, int b) {
		
		try {
			int result = a / b;
		}catch(IllegalArgumentException e) {
			System.out.println("Error! Cannot be divided by 0");
			e.printStackTrace();
		}
		return a / b;
	}

}
