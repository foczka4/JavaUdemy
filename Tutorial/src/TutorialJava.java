
public class TutorialJava {

	public static void main(String[] args) {
		
		float arr[] = {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f,9.0f};
		//System.out.println(arr[5]);
		
		System.out.println(arr.length);
		
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		for (float e : arr) {
			System.out.println(e); 
		}

	}

}
