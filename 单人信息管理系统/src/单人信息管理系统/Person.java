package ������Ϣ����ϵͳ;

import java.io.Serializable;

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