package org.javatutorials.eclipse.loop_ex_01;

public class loop_ex_01 {

	public static void main(String[] args) {
		// 반복문
		int a=1;
		int b;
		int c;
		long x,y;
		while(a<=9){
			a++;
			b=1;
			System.out.printf("구구단 연습 %d단\n",a);
			while(b<=9){
				c=a*b;
				System.out.printf("%d X %d = %d\n",a,b,c);
				b++;

			}
	
		}
		for(x=1,y=1;x<=100;x++){
			y=y*x;
			if(y<=0) continue;
			System.out.printf("%d! = %d\n",x,y);
		}
		
	}

}
