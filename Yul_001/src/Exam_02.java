
public class Exam_02 {
	
	public static void main(String[] ar){
		int x = 128;
		long y = x;
		byte z = (byte)x;
		
		char a = 65;
		short b = (short)a;
		byte c = 100;
		short d = c;
		char e = (char)c;
		
		long f = 100L;
		float g = f;
		
		float h = 10.72f;
		long i = (long)h;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("g = " + g);
		System.out.println("i = " + i);
		
		byte a_min = Byte.MIN_VALUE;
		byte a_max = Byte.MAX_VALUE;
		
		char b_min = Character.MIN_VALUE;
		char b_max = Character.MAX_VALUE;
		
		int c_min = Integer.MIN_VALUE;
		int c_max = Integer.MAX_VALUE;
		
		float d_min = Float.MIN_VALUE;
		float d_max = Float.MAX_VALUE;
		
		System.out.println("byte = " + a_min + " ~ " + a_max);
		System.out.println("byte = " + (int)b_min + " ~ " + (int)b_max);
		System.out.println("byte = " + c_min + " ~ " + c_max);
		System.out.println("byte = " + d_min + " ~ " + d_max);
		
		
	}

}
