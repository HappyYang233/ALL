package 单人信息管理系统;
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
		String name=this.id.getString("请输入姓名","请输入正确格式的姓名");
		int age=this.id.getInt("请输入年龄", "请输入正确格式的年龄");
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
			System.out.println("暂无数据，请add");
			
		}
		else
		{
		Person per= (Person)ser.dser(file);
		String name=this.id.getString("请输入姓名","请输入正确格式的姓名");
		
		int age=this.id.getInt("请输入年龄", "请输入正确格式的年龄");
		per.setName(name);
		per.setAge(age);
	
		this.ser.ser(per, this.file);
		}
		
	}
	public void load() throws Exception, IOException, Exception
	{
		if(!file.exists())
		{
			System.out.println("暂无数据，请add");
			
		}
		else
		{
		Person per = (Person)ser.dser(file);
		System.out.println(per);
		}
	}
}
