
public class TutorialJava8 {

	public static void main(String[] args) {
		// multicatch block
		
		int array[] = new int[10];
		
		try
		{
			//System.out.println(array[10]);
			int i = 10 /0;
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Array Index Error");
			System.out.println(error);
		}
		catch(ArithmeticException error) {
			System.out.println("Math Error");
			System.out.println(error);
		}
		
		System.out.println("End");

	}

}
