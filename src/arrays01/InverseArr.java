package arrays01;

import java.util.Arrays;

/**
 * Created by Serg on 27.12.2016.
 */
public class InverseArr {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8};
//        System.out.println("Before: " + Arrays.toString(arr));
//        invert0(arr);
//        invertRec(arr,0);
//        System.out.println("After: " + Arrays.toString(arr));
//        String str="Direct string";
//        System.out.println("Invers string: " + invertStr(str));
        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};

//        for (int i=0;i<array.length-1;i++){
//           // swap(array,i,i+1);
//            conditionSwap(array,i,i+1);
//        }
        //System.out.println("array: " + Arrays.toString(array));
        System.out.println("Arrays before sort: " + Arrays.toString(array));
        //sortBubleInverse(array);
        //sortBarrier(array);
        //sortSelect(array);
        //sortBubleInverse(array);
        sortInsert(array);
        System.out.println("Arrays before sort: " + Arrays.toString(array));
    }

    public static void invert(int[] data) {
        int l = data.length;
        System.out.println("arr: " + Arrays.toString(data) + " lenght=" + l);
        for (int i = 0; i < l / 2; i++) {
            int tmp = data[i];
            //System.out.println("tmp=" + tmp);
            data[i] = data[l - 1 - i];
            data[l - 1 - i] = tmp;
            //System.out.println(""+data[l-])
        }

    }

    public static void invert0(int[] data) {
        int l = data.length;
        for (int i = l / 2 - 1; i >= 0; i--) {
            int tmp = data[i];
            data[i] = data[l - 1 - i];
            data[l - 1 - i] = tmp;
        }

    }

    public static String invertStr(String str) {
        char[] charStr = str.toCharArray();
        int l = charStr.length;
        for (int i = 0; i < l / 2; i++) {
            char tmp = charStr[i];
            charStr[i] = charStr[l - 1 - i];
            charStr[l - 1 - i] = tmp;
        }
        return new String(charStr);
    }

    public static void invertRec(int[] data, int k) {

        if (k < data.length / 2 - 1) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invertRec(data, k + 1);
        }

    }

    public static void swap(int[] array, int fst, int snd) {
        int tmp = array[fst];
        array[fst] = array[snd];
        array[snd] = tmp;
    }

    public static void conditionSwap(int[] data, int fst, int snd) {
        if (data[fst] > data[snd]) {
            int tmp = data[fst];
            data[fst] = data[snd];
            data[snd] = tmp;
        }

    }

    public static void sortBuble(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }

    }

    public static void sortBubleInverse(int[] data) {
        for(int i = data.length-1;i>0;i--){
            for (int j=data.length-1;j>data.length-i-1;j--){
                if(data[j]<data[j-1]){
                    int tmp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=tmp;
                }
            }

        }
    }

    public static void sortBarrier(int[] data){
        for(int barrier=data.length-1;barrier>=0;barrier--){
            for(int index=0;index<barrier;index++){
                if(data[index]>data[index+1]){
                    int tmp=data[index];
                    data[index]=data[index+1];
                    data[index+1]=tmp;
                }
            }
        }
    }
    public static void sortBarrierInvers(int[] data){
        for (int barrier=0;barrier<data.length-1;barrier++){
            for(int index=data.length;index>barrier;index--){
                if(data[index]<data[index-1]) {
                    int tmp = data[index];
                    data[index]=data[index-1];
                    data[index-1]=tmp;
                }
            }
        }

    }

    public static void sortSelect(int[] data){
        for (int barrier=0;barrier<data.length;barrier++){
            int indexMin=barrier;
            for(int index=barrier+1;index<data.length;index++){
                if(data[barrier]<data[index]){
                    indexMin=index;
                }
            }
            int tmp=data[barrier];
            data[barrier]=data[indexMin];
            data[indexMin]=tmp;
        }

    }

    //[5, 1, 3, 4, 0, 8, 9, 7, 6, 2]
    //[5, 1, 3, 4, 0, 8, 9, 7, 6, 2]
    public static void sortInsert(int[] data){
        for(int barrier=1;barrier<data.length;barrier++){
            System.out.println("Before " + barrier+" " + Arrays.toString(data));
            int index=barrier-1;

            while(index>=0 && data[index+1]<data[index] ){
                System.out.println(data[index+1] + "->" + data[index]);
                int tmp=data[index];
                data[index]=data[index+1];
                data[index+1]=tmp;
                index--;
            }
            System.out.println("After  " + barrier+" " + Arrays.toString(data));
        }
    }



}
