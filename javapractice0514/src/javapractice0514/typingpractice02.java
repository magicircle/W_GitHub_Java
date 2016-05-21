package javapractice0514;

import java.io.*;

public class typingpractice02 {

	public static void main(String[] args) throws IOException {
		InputStreamReader myStream = new InputStreamReader(System.in);
		BufferedReader mrKeyboard = new BufferedReader(myStream);

		File myFile = new File("typing01.txt");
		FileReader mfRead = new FileReader(myFile);
		BufferedReader mrFile = new BufferedReader(mfRead);
		
		String[] readedString = new String[128];
		
		String typingdString;
		int nLine = 0;
		int cCount =0;
		int rRand = 0;
		
		while(true){
			readedString[nLine] = mrFile.readLine();
			if (readedString[nLine]==null) break; 
//			System.out.println(readedString[nLine]);
			nLine++;
		}
		mrFile.close();
		
		// 타이핑 입력과 검사루팅
		for(int i=0; i<5 ; i++){
			rRand = (int) (Math.random() * nLine);
			System.out.print((i+1)+" : ");
			System.out.println(readedString[rRand]);  // 임의인덱스 사전 출력
		
			// 인덱스된 사전과 검사
			typingdString = mrKeyboard.readLine(); // 키보드 입력
			
			for (int j=0 ; j<readedString[rRand].length() ; j++){
				if (j>=typingdString.length()){
					System.out.print("^");
					continue;
				}
				if(typingdString.charAt(j)!=readedString[rRand].charAt(j)){
					System.out.print("^");
					continue;
				}
				System.out.print(".");
				cCount++;
			}
			System.out.println("바른 글자수 :"+ cCount);
			cCount=0;
		}

	}
}
