package org.javatutorials.eclipse.loopex02;

public class loopex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		for(a=1;a<10;a++){
			System.out.printf("구구단 연습 %d단\n",a);
			for(b=1;b<10;++b){
				c=a*b;
				System.out.printf("%d X %d = %d\n",a,b,c);
				
			}
		}
	
	}
	

}
