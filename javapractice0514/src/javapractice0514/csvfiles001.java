package javapractice0514;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
* Created on 2016-05-15 by yong
*/
public class csvfiles001 {
    public static void main(String[] args) throws IOException {
        char[] acName = {'가','나','다','라','마','바','사','아','자','차',
                         '카','타','파','하','송','허','기','박','처','두'};
        char[] acSex = {'남','여'};
        String[] asBlood = {"A","B","AB","O"};
        char cSex;
        int nAge;
        int nWish;

        FileWriter fw = new FileWriter("test.csv");
        String sHeader = "이름,나이,성별,혈액형,희망보수\r\n";
        fw.write(sHeader);

        for (int i = 0; i < 100000 ; i++) {
            Random myRand = new Random();
            String sName = Character.toString(acName[myRand.nextInt(20)]) +
                    Character.toString(acName[myRand.nextInt(20)]) +
                    Character.toString(acName[myRand.nextInt(20)]);
            String sBlood = asBlood[myRand.nextInt(4)];
            cSex = acSex[myRand.nextInt(2)];
            nAge = 20 + myRand.nextInt(20);
            nWish = (200 + myRand.nextInt(30) * 10);
            // Row Dataset
            String sRow = sName + "," +
                    nAge + "," +
                    cSex + "," +
                    sBlood + "," +
                    nWish;

            fw.write(sRow+"\r\n");
          //  System.out.println(sRow);
        }

        fw.close();




    }
}
