import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("file.encoding"));
		File f= new File("./test");
		OutputStream out = new FileOutputStream(f);
		byte b[]= "�й�".getBytes("ISO8859-1");
		out.write(b);
		System.out.println(b);
		out.close();
		
	}

}
