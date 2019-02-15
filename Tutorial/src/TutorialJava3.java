import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TutorialJava3 {

	public static void main(String[] args) throws IOException{
		
		FileReader input = null;
		
		input = new FileReader("FileInput.txt");
		
		int number;
		
		while ((number = input.read()) != -1) {
			System.out.println(number);
		}
		
		FileWriter output = null;
		
		output = new FileWriter("Awesome.txt");
		
		output.write(650);

	}

}
