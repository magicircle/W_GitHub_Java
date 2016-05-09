import java.io.*;

public class Exam_05 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		String age = "";
		String imsi = "";
		byte a = 0;
		int b = 0;
		float c=0.0f;
		
		
		System.out.print("name : ");
		name = in.readLine();
		
		System.out.print("Age  : ");
		age = in.readLine();
		
		System.out.print("count  : ");
		imsi = in.readLine();
		
		
		
		System.out.println();
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);

		a=Byte.parseByte(imsi);
		b=Integer.parseInt(imsi);
		c=Float.parseFloat(imsi);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
}
