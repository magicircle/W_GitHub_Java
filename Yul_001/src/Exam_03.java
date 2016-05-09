
public class Exam_03 {
	public static void main(String[] ar){
		
		System.err.println("에러 출력 스트림...");
		System.out.println("기본 출력 스트림...");
		System.out.println();
		
		System.out.write(65);
		System.out.flush();
		System.out.println();
		
		byte[] by = new byte[]{'J', 'A', 'V', 'A'};
		System.out.write(by, 0, 3); //auto flush
		System.out.println();
		
		int x = 100;
		char y = 'B';
		System.out.print(x);
		System.out.print(y);
				
		int a = 100;
		char b = 'A';
		float c = 12.3456789f;
		String d = "Hello Java";
		
		System.out.printf("a = %d 입니다\n", a);
		System.out.printf("b = %c = %d 입니다\n",b,(int)b);
		System.out.printf("c = %6.2f 입니다\n", c);
		System.out.printf("d = %s 입니다\n", d);
		
		
		
	}

}
