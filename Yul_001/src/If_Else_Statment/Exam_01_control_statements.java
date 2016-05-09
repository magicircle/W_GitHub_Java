package If_Else_Statment;

import java.io.*;

public class Exam_01_control_statements {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("수를 입력하세요 : ");
		int x=Integer.parseInt(in.readLine());
		
		System.out.println("x = "+x);
				
	}
	
}
