package org.javatutorials.eclipse.array_ex01;

public class array_ex01 {

	public static void main(String[] args) {
		// 배열
		String[] weeks = {"월","화","수","목","금","토","일"};
		
		for(String we : weeks){
			System.out.printf("%s요일 %d\n",we,weeks.length);
		}
		
	}

}
