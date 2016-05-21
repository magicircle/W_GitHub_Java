package javapractice0514;/*
* Created on 2016-05-15 by yong
*/

import java.io.IOException;

public class scvfile02 {
    public static void main(String[] args) throws IOException {

        String sTmp = "나라박,25,여,AB,450+-사박차,24,남,A,280+-" +
                       "타카박,20,여,A,350+-카아바,36,남,B,320+-" +
                       "마차차,21,여,A,280+-하라가,31,남,A,440+-";

        int nCount =0;
        int nCol =0;

        for (int i = 0; i < sTmp.length() ; i++) {
            if (sTmp.charAt(i)=='+'){
                nCount++;
            }
            if (sTmp.charAt(i)==','){
                nCol++;
            }
        }
        System.out.println("총 "+nCount+"명의 정보가 있습니다.");

        nCol = nCol/nCount;
        System.out.println("총 "+(nCol+1)+"개의 구분이 있습니다");



    }
}
