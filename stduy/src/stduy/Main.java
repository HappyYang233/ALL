package stduy;


	class Check{
		
		public boolean check(String[] info)
		{
		
			if(info[0].equals("L")&&info[1].equals("y"))
				return true;
			else
				return false;
		}
	}
	
	class Operate{
		private String[] info;
		public Operate(String[] info)
		{
			this.info=info;
			
		}
		public void login()

		{
		  	this.isExit();
		  	Check check = new Check();
		  	
		  	if(check.check(this.info)==true)
		  	System.out.println("��½�ɹ�");
		  	else
		  		System.out.println("ʧ��");
		}
		public void isExit()
		{
			if(this.info.length!=2)
			{
				System.out.println("�˳�");
			}
				
		}
	}
	public class Main {
	public static void main(String[] args) {
		
		Operate oper= new Operate(args);
		oper.login();
		
	}

}