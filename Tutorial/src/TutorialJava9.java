
public class TutorialJava9 {

	public static void main(String[] args) {
		// throw and throws keywords
		
		
		try {
			Func();
		} catch (ArithmeticException error) {
			System.out.println("Arithmetic Exception Triggered, oh yh!");
		}
	}
	
	public static void Func() throws ArithmeticException{
		//throw new ArithmeticException();
	}

}
