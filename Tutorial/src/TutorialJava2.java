import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TutorialJava2 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream input = null;
		
		input = new FileInputStream("FileInput.txt");
		
		int number;
		
		while ((number = input.read()) != -1) {
			System.out.println(number);
		}
		
		FileOutputStream output = null;
		
		output = new FileOutputStream("Awesome.txt");
		
		output.write(650);

	}

}
