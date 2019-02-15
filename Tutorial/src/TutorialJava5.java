import java.io.File;

public class TutorialJava5 {

	public static void main(String[] args) {
		
		File f = null;
		
		String paths[];
		
		f = new File("/Applications");
		
		paths = f.list();
		
		for (String p : paths) {
			System.out.println(p);
		}

	}

}
