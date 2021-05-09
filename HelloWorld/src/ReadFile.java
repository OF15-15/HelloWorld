
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void ladeDatei(String datName) {

		File file = new File(datName);

		if (!file.canRead() || !file.isFile()) {
			System.out.println("not able to find");
			System.exit(0);

		}
		FileReader fr = null;
		int c;
		StringBuffer buff = new StringBuffer();
		try {
			fr = new FileReader(file);
			while ((c = fr.read()) != -1) {
				buff.append((char) c);
			}
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(buff.toString());
	}

	public static void main(String[] args) {
		String dateiName = "/Users/ich/Documents/git/repository/HelloWorld/src/Hello World.txt";
		ladeDatei(dateiName);
	}
}
