import java.io.*;
public class Demo2 {
	public static void main(String[] args) throws IOException
	{
		int i=0;
		int j=0;
		BufferedReader buf = null;
		buf= new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		System.out.println("请输入第一个字数");
		str=buf.readLine();
		i=Integer.parseInt(str);
		System.out.println("请输入第二个字数");
		str=buf.readLine();
		
		j=Integer.parseInt(str);
		System.out.println("结果="+(i+j));
		
	}
}
