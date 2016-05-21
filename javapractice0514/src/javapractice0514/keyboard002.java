package javapractice0514;

import java.io.IOException;

public class keyboard002 {
	public static void main(String[] args) throws IOException {
	//								  // 입력
		int nTmp1 = System.in.read();
		System.in.skip(2); // 2바이트 (10,13) 버퍼 스킵
		int nTmp2 = System.in.read();
		System.in.skip(2);
		int nTmp3 = System.in.read();
		System.in.skip(2);
		int nTmp4 = System.in.read();
		System.in.skip(2);
		int nTmp5 = System.in.read();
		System.in.skip(2);
		int nTmp6 = System.in.read();
		System.out.println(nTmp1);
		System.out.println(nTmp2);
		System.out.println(nTmp3);
		System.out.println(nTmp4);
		System.out.println(nTmp5);
		System.out.println(nTmp6);
		
		
		
		
		
		
		
	}
}
