package recursive;

import java.util.Arrays;

/**
 * Created by Serg on 13.01.2017.
 */
public class App00 {
    public static void main(String[] args){
        //f(1);
//        int[] data={1,2,3,4,5,6,7,8,9};
//        swapArr(data,0);
//        System.out.println(Arrays.toString(data));
        //System.out.println("fib(5)=" + fib(5));
        int[] arr={1,2,3,4};
        combinations(arr,"");
    }
    public static void f(int arg){
        //System.out.println(" " + arg);
        if(arg<7){
            f(2*arg);
        }
        System.out.println(" " + arg);
    }

    public static int fib(int arg){

        int result = (arg <2)? 1 : fib(arg-1)+fib(arg-2);
        System.out.print(" " + arg);
        return result;
    }

    public static void swapArr(int[] arr,int pos){

        if(pos<arr.length/2){
            int tmp=arr[pos];
            arr[pos]=arr[arr.length-pos-1];
            arr[arr.length-pos-1]=tmp;
            swapArr(arr,pos+1);
        }

    }

    public static void combinations(int[] data,String str){

        if(data.length==2){
            String str1=str + data[0]+", "+data[1];
            System.out.println(str1);
            String str2=str + data[1]+", "+data[0];
            System.out.println(str2);
        }else{
            for(int i=0;i<data.length;i++){
                String strA=str + data[i] + ", ";
                int[] dataNew=new int[data.length-1];
                //System.arraycopy(data,1,dataNew,0,data.length-1);
                int count=0;
                for(int j=0;j<data.length;j++){

                    if(j==i){
                        continue;
                    }else{
                        dataNew[count++]=data[j];
                    }
                }
                combinations(dataNew,strA);
            }
        }
    }

    public static String getComment(){
        return "Some first method after clone project to other project";
    }
}
