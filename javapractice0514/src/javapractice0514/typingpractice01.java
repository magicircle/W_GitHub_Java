package javapractice0514;

import java.io.*;

public class typingpractice01{
	public static void main(String[] args) throws IOException{
		BufferedReader myReader = new BufferedReader
			(new InputStreamReader(System.in));
		File myFile = new File("typing01.txt");
		
		// ������ ������ ����� ������ ���� ����
		BufferedWriter myOut = new BufferedWriter
			(new FileWriter( myFile,true));
		
		String myType = new String();
		
		while( true ){
			myType = myReader.readLine();
			myOut.append(myType);  // ���� ���Ͽ� �����
			myOut.newLine();
			if (myType.isEmpty()) break;
			
		}
		
		myOut.close();
	}
}
