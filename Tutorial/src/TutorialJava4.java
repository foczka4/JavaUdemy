import java.io.IOException;
import java.io.InputStreamReader;

public class TutorialJava4 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader in = null;
		
		in = new InputStreamReader(System.in);
		System.out.println("Enter charackters, e to exit");
		
		char ch;
		
		do {
			ch = (char) in.read();
			System.out.println(ch);		
		}while(ch != 'e');
		
		if (in != null) {

			in.close();	
		}
		
	}

}
