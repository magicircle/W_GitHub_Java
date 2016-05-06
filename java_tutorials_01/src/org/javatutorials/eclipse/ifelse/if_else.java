package org.javatutorials.eclipse.ifelse;

public class if_else {

	public static void main(String[] args) {
		// 조건문 연습
		int a=5;
		int b=2;
		
		if (a>b){
			System.out.printf("%d는 %d보다 큰 수",a,b);
		}
		else if(a<b){
			System.out.printf("%d는 %d보다 작은 수",a,b);
		}
		else {
			System.out.printf("%d와 %d는 같은 수",a,b);
		}
		
	}

}
