package 继承的认知;

public class Main {	
	public static void main(String[] args)
	{
	Son s = new Son(1,2);	  
	s.test();
	}
}
		 
class Father
{
	private int k;
	public Father(int i)
	{
		this.k=i;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	
	
		
	
}

class Son extends Father {
			private int k;
		public int getK() {
				return k;
			}
			public void setK(int k) {
				this.k = k;
			}
		public Son(int i,int j)
		{
			
			super(i);
			this.k=j;
		}
		public void test()
		{

			System.out.println(super.getK());
			System.out.println(this.getK());
			System.out.println();
			
		}
		}
