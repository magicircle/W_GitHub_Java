package javapractice0514;

import java.io.*;

public class keyboard004 {
	public static void main(String[] args) throws IOException {
		BufferedReader myBuffer = new BufferedReader 
				( new InputStreamReader(System.in));
		byte[] b = new byte[10];
		int[] sTmp3 = new int[10];
		String sTmp1 = myBuffer.readLine();
		String sTmp2 = myBuffer.readLine();
		sTmp3[0] = System.in.read( b, 3, 5);
		System.out.println(sTmp1);
		System.out.println(sTmp2);
		for (int i=0 ; i<sTmp3.length ; i++)
			System.out.print(sTmp3[i]+" ");
	
		
		
	}

}
