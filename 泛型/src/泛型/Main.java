package ·ºÐÍ;
interface Info<T>{
	public T getVar();
}
class InfoImpl<T> implements Info<String>{
	private String var;
	public InfoImpl(String var)
	{
		this.var=var;
	}
	public String getVar() {
		return var;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoImpl i = new InfoImpl("Ñî");
		System.out.println(i.getVar());
	}

}
