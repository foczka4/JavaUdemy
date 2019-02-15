
public class TutorialJava10 {

	public static void main(String[] args) {
		// finally block
		
		try {
			int i = 10 / 0;
		} catch (ArithmeticException error) {
			System.out.println("Division by zero, very naughty");
		}
		finally {
			System.out.println("Oh yeah, finally");
		}
		System.out.println("End");
		
	}

}
