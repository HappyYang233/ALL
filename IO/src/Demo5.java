import java.io.*;
class Person implements Serializable{
	private String name;
	private static final long serialVersionUID=1L;
	public Person(String name,int age)
	{
		this.name= name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	@Override
		public String toString()
		{
		return this.name+this.age;
		}
}
public class Demo5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person per[] = {new Person("����",5),new Person("����",9)};
		ser(per);
		dser();
	}
	public static void ser(Object obj[])throws Exception
	{
		File f= new File("./test3");
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(obj);
	}
	public static Object[] dser() throws Exception{
	File f= new File("./test3");
	ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
	Object[] per =(Object[])ois.readObject();
	for(int i=0;i<per.length;i++)
	{
		Person p= (Person)per[i];
		System.out.println(p);
	}
	
	return per;

}
}
