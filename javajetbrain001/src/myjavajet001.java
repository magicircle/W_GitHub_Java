/**
 * Created by yong on 2016-05-14.
 */
public class myjavajet001 {
    public static void main(String[] args) throws InterruptedException{
        int[] anTmp = new int[1000];
        int nMax = anTmp.length;
        int nPosition = 0;
        int nProgress = 0;
        int nOldProgress =0;

        System.out.println("+------10%+------20%+------30%+------40%+------50%+------60%+------70%+------80%+------90%+-----100%");
        for (int i=1 ; i<=nMax ; i++){
            nPosition = i;
            nProgress = (int)( (nPosition*1.0D/nMax)*100 );
            if (nOldProgress != nProgress) {
//                System.out.println(nProgress + "%");
                System.out.print("*");
                nOldProgress = nProgress;
            }
            anTmp[i-1]=i;
            Thread.sleep(10);


        }
    }
}
