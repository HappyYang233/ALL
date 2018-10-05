import java.io.*;

public class Copy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length!=2)
		{
			System.out.println("输入参数不足");
			System.exit(1);
		}
		File f1= new File(args[0]);
		File f2= new File(args[1]);
		if(!f1.exists())
		{
			System.out.println("不存在源文件");
			System.exit(1);
		}
		InputStream in = new FileInputStream(f1);
		OutputStream out = new FileOutputStream(f2);
		int temp;
		while((temp=in.read())!=-1)
		{
			out.write(temp);
		}
		System.out.print("copy完成");
		out.close();
		in.close();
	}

}
