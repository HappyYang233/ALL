package ·ºÐÍ;
interface Infoss{
	
}
class Contact implements Infoss{
	private String address;
	
	public Contact(String address)
	{
		this.address= address;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
class Basic implements Infoss{
	private String name;
	public Basic(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Person <T extends Infoss>{
	private T info;
	public Person(T info)
	{
		this.info=info;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
}
public class Main4 {
	public static void main(String[] args)
	{
	Person<Contact> p = null;
	p = new Person<Contact>(new Contact("±±¾©"));
	System.out.println(p.getInfo().getAddress());
	}
	
			
}
