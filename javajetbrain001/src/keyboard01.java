import java.io.IOException;

/**
 * Created by yong on 2016-05-15.
 */
public class keyboard01 {
    public static void main(String[] args) throws IOException {
/*
        try {
            System.out.println("Input and return ");
            int nTmp = System.in.read();
            System.out.println("Input Success " + (char)nTmp);

        } catch (IOException e) {
            e.printStackTrace();
*/
        byte[] abTmp = new byte[32];
        String sTmp = new String(abTmp);
        System.in.read(abTmp);
        for (int i=0 ; i<abTmp.length ; i++ ){
            System.out.print(abTmp[i] + " ");
        }
        System.out.println();
        System.out.print(sTmp);



    }
}
