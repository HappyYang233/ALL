import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class Util{
	private BufferedReader buf=null;
	public Util() {
		this.buf= new BufferedReader(new InputStreamReader(System.in));
	}
	public String getInfo(String info) throws Exception
	{
		String temp = null;
		System.out.println(info);
		temp=this.buf.readLine();
		return temp;
	}
	public Date getDate(String info,String err) throws Exception
	{
		Date temp=null;
		String str=null;
		boolean flag= true;
		while(flag)
		{
			str=this.getInfo(info);
		if(str.matches("^\\d{4}-\\d{2}-\\d{2}$"))
		{
			SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-DD");
			temp=sdf.parse(str);
	
			flag = false;
		}
		else
			
			System.out.println(err);
		}
		return temp;
			
		
	}

}
public class Demo3 {
	public static void main(String[] args) throws Exception
	{
		Util util = new Util();
		Date i=util.getDate("����������","�������������������");
	
		System.out.println(i);
	}
}