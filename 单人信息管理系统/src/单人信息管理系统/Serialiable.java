package 单人信息管理系统;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialiable {
	public void ser(Object obj,File f) throws IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(obj);
		oos.close();
	}
	public Object dser(File f) throws FileNotFoundException, IOException, Exception
	{
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
		Object obj =ois.readObject();
		ois.close();
		return obj;
	}
}
