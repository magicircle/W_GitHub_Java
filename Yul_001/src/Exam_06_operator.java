

public class Exam_06_operator {

	public static boolean mbool_t(){
		System.out.println("true method TTT");
		return true;
	}
	
	public static boolean mbool_f(){
		System.out.println("false method FFF");
		return false;
	}
	
	public static void main(String[] ar){
		int xTemp = 23;
		boolean mbool_j;
		
		Exam_06_operator ex = new Exam_06_operator();
		boolean boolex = ex instanceof Object;

		System.out.println(boolex);
		System.out.println(1<<3);
		System.out.println(16>>3);
		System.out.println(Integer.toBinaryString(16>>2));
		
		System.out.println(1<3);
		System.out.println(1!=3);
		
		System.out.printf("%X\n",xTemp<<3);
	
		mbool_j = mbool_f() && mbool_t();
		System.out.println("BOOL = "+mbool_j);
		
		mbool_j = mbool_f() & mbool_t();
		System.out.println("BOOL = "+mbool_j);
	
	
	}
	
}
