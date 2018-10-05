package 单人信息管理系统;
import java.io.*;
public class InputData {
	private BufferedReader buf;
	public InputData()
	{
		this.buf=new BufferedReader(new InputStreamReader(System.in));
		
	}
	public String getString(String info) throws IOException
	{
		String str=null;
		System.out.println(info);
		str=this.buf.readLine();
		return str;
		
	}
	public int getInt(String info,String err) throws IOException
	{
		String str=null;
		int i=0;
		boolean flag=true;
		while(flag)
		{
			str=this.getString(info);
		
		if(str.matches("^\\d$"))
		{
			i=Integer.parseInt(str);
			flag=false;
		}
		else
		{
			System.out.println(err);
			
		}
		}
		return i;
	}

	public String getString(String info,String err) throws IOException
	{
		String str=null;
		String i=null;
		boolean flag = true;
		while(flag)
		{
		
			str=this.getString(info);
			if(str.matches("^\\w+$"))
			{
			i=str;
			flag=false;
			}
		else
		{
			System.out.println(err);
			
		}
		
	}
		return i;
	}
}
