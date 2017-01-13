package recursive;

import java.util.Arrays;

/**
 * Created by Serg on 13.01.2017.
 */
public class App00 {
    public static void main(String[] args){
        //f(1);
        int[] data={1,2,3,4,5,6,7,8,9};
        swapArr(data,0);
        System.out.println(Arrays.toString(data));
    }
    public static void f(int arg){
        //System.out.println(" " + arg);
        if(arg<7){
            f(2*arg);
        }
        System.out.println(" " + arg);
    }

    public static void swapArr(int[] arr,int pos){

        if(pos<arr.length/2){
            int tmp=arr[pos];
            arr[pos]=arr[arr.length-pos-1];
            arr[arr.length-pos-1]=tmp;
            swapArr(arr,++pos);
        }

    }
}
