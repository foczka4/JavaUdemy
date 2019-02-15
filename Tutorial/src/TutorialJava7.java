
public class TutorialJava7 {

	public static void main(String[] args) {
		// exceptions
		
		int array[] = new int[10];
		
		try
		{
			System.out.println(array[10]);
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println(error);
		}
		
		System.out.println("End");
	}

}
