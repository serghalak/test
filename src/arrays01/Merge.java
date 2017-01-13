package arrays01;

import java.util.Arrays;

/**
 * Created by Serg on 04.01.2017.
 */
public class Merge {

    public static void main(String[] args){
        int[] a ={0,0,10,15,17};
        int[] b={1,2,3,3,5,7};
        System.out.println("array merge: " + Arrays.toString(merge(a,b)));
        System.out.println("array a: " + Arrays.toString(a));
        System.out.println("array b: " + Arrays.toString(b));
    }

    public static int[] merge(int[] a, int[] b){
        int lenA=a.length;
        int lenB=b.length;
        int[] result=new int[lenA+lenB];
        int indexA=0;
        int indexB=0;
        int counter=0;
        while(true){

            //System.out.println("counter="+counter);
            if(indexA==lenA ){
                //System.out.println("indexA==lenA-1 with counter="+counter);
                System.arraycopy(b,indexB,result,counter,lenB-indexB);
                break;
            }else if(indexB==lenB){
                //System.out.println("indexB==lenB-1 with counter="+counter);
                //System.out.println("indexA="+indexA+" lenA-indexA="+(lenA-indexA));
                System.arraycopy(a,indexA,result,counter,lenA-indexA);
                break;
            }
            if(a[indexA]<b[indexB]){
                result[counter]=a[indexA++];
                //indexA++;
            }else{
                result[counter]=b[indexB++];
                //indexB++;
            }
            counter++;
        }
        return result;

    }
}
