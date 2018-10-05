package ·ºÐÍ;
class Demo{
	public <T> T fun(T t)
	{
		return t;
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		String str= demo.fun("yang");
		int i = demo.fun(1);
		System.out.println(str+"    "+i);
	}

}
