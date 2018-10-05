package ·ºÐÍ;
class infor<T extends Number>
{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	public String toString() {
		return this.var.toString();
	}
	
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 infor<Integer> info= fun(30);
		 System.out.println(info.getVar());
		 
	}
	
	public static <T extends Number> infor<T> fun(T p)
	{
		infor<T> temp = new infor<T>();
		temp.setVar(p);
		return temp;
	}
}
