package ������Ϣ����ϵͳ;
import java.io.*;
public class Operate {
	private File file;
	private InputData id;
	private Serialiable ser;
	public Operate() {
		this.file= new File("./test8");
		this.id=new InputData();
		this.ser=new Serialiable();
	}
	public void add() throws IOException
	{
		String name=this.id.getString("����������","��������ȷ��ʽ������");
		int age=this.id.getInt("����������", "��������ȷ��ʽ������");
		Person per= new Person(name,age);
		this.ser.ser(per, this.file);
		
		
	}
	public void delect()
	{
		this.file.delete();
	}
	public void change() throws FileNotFoundException, IOException, Exception
	{
		if(!file.exists())
		{
			System.out.println("�������ݣ���add");
			
		}
		else
		{
		Person per= (Person)ser.dser(file);
		String name=this.id.getString("����������","��������ȷ��ʽ������");
		
		int age=this.id.getInt("����������", "��������ȷ��ʽ������");
		per.setName(name);
		per.setAge(age);
	
		this.ser.ser(per, this.file);
		}
		
	}
	public void load() throws Exception, IOException, Exception
	{
		if(!file.exists())
		{
			System.out.println("�������ݣ���add");
			
		}
		else
		{
		Person per = (Person)ser.dser(file);
		System.out.println(per);
		}
	}
}
