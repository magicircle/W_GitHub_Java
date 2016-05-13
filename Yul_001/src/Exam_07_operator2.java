import java.io.*;

public class Exam_07_operator2{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int kor=0, eng=0, mat=0, tot=0;
		double avg=0;
		do{	
			System.out.print("Kor : ");
			kor = Integer.parseInt(in.readLine());
		} while(kor<0 || kor >100);

		do{	
			System.out.print("Eng : ");
			eng = Integer.parseInt(in.readLine());
		} while(eng<0 || eng >100);
		do{
			System.out.print("Mat : ");
			mat = Integer.parseInt(in.readLine());
		} while(mat<0 || mat >100);
			
			tot=kor+eng+mat;
			avg = tot/3.0;
			
		System.out.println();
		System.out.println("total = "+tot+"¡°");
		System.out.printf("Avg = %.2f¡°", avg);

		
	}
		
}


