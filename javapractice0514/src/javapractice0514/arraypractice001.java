package javapractice0514;

import java.util.ArrayList;
import java.util.List;

public class arraypractice001 {
	public static void main(String[] args){
		char[] acTmp = new char[5];
		acTmp[0]='H';
		acTmp[1]='e';
		acTmp[2]='l';
		acTmp[3]='l';
		acTmp[4]='o';
				
		for ( int i=0 ; i<acTmp.length ; i++ )
			System.out.print(acTmp[i]);
		
		char[] acTmp2 = new char[12];
		

		for ( int i=0 ; i<acTmp.length ; i++ )
			acTmp2[i] = acTmp[i];
		
		acTmp2[acTmp.length] = ' ';
		acTmp2[acTmp.length+1] = 'M';
		acTmp2[acTmp.length+2] = 'R';
		acTmp2[acTmp.length+3] = '.';
		acTmp2[acTmp.length+4] = 'K';
		acTmp2[acTmp.length+5] = 'I';
		acTmp2[acTmp.length+6] = 'M';

		for( int i=0 ; i<acTmp2.length ; i++ ) {
			System.out.print(acTmp2[i]);
		}
		System.out.println();
		
		List <String> lstsTmp = new ArrayList<String>();
		
		lstsTmp.add("???????? 1");
		lstsTmp.add("???????? 2");
		lstsTmp.add("???????? 3");
		lstsTmp.add("???????? 4");
		lstsTmp.add("???????? 5");
		
		lstsTmp.remove(2);
		lstsTmp.add(2,"???????? 3?? ????");
		lstsTmp.set(3, "???????? 4?? ???");
		lstsTmp.add(2,"???????? 33333?? ???");
		
		for (String sTmp : lstsTmp)
			System.out.println(sTmp);










		}
}
