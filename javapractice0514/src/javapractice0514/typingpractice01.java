package javapractice0514;

import java.io.*;

public class typingpractice01{
	public static void main(String[] args) throws IOException{
		BufferedReader myReader = new BufferedReader
			(new InputStreamReader(System.in));
		File myFile = new File("typing01.txt");
		
		// 파일이 없으면 만들고 있으면 덮어 쓴다
		BufferedWriter myOut = new BufferedWriter
			(new FileWriter( myFile,true));
		
		String myType = new String();
		
		while( true ){
			myType = myReader.readLine();
			myOut.append(myType);  // 기존 파일에 덮어쓰기
			myOut.newLine();
			if (myType.isEmpty()) break;
			
		}
		
		myOut.close();
	}
}
