package org.javatutorials.eclipse.ifelse_02;

public class ifelse_02 {

	public static void main(String[] args) {
		// 조건문
		String id = args[0];
		if(id.equals("yong")){
			System.out.printf("%s는 회원입니다",id);
		}
		else {
			System.out.printf("%s는 회원이 아닙니다",id);
		}
		
	}

}
