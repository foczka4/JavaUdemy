import java.io.File;

public class TutorialJava6 {

	public static void main(String[] args) {
		// we create folders
		
		String directotory = "/Users/Hello";
		File f = new File(directotory);
		
		f.mkdirs();

	}

}
