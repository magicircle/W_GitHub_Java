import java.io.*;

public class Exam_08_method 
{
	public static void main(String[] ar)throws IOException
	{
		FileInputStream in = new FileInputStream("miro_01.txt");

		
		int i,j;
		short x_Cord=0;
		short y_Cord=0;
		int char_Temp;
		char escCode = 0x1B;
		char mouse_Char = '@';
		char[][] char_Line = new char[24][80];
		
		i=0 ; j=0;
		while ( ( char_Temp=in.read() ) != -1 )
		{
			char_Line[j][i]=(char)char_Temp;
			System.out.print(char_Line[j][i]);
			i=i+1;
			if (i>=80)
			{
				i=0;
				j=j+1;
			}
		}	 
		
//		for ( j=0 ; j<24 ; j=j+1)
//		{	
//			for ( i=0 ; i<80 ; i=i+1 )
//				System.out.print(char_Line[j][i]);
//		}

		
		jht.setCursorPosition(y_Cord, x_Cord);
		System.out.print(mouse_Char);
		
		in.close();			
	}

}



