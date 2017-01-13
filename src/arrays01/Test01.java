package arrays01;

/**
 * Created by Serg on 25.12.2016.
 */
public class Test01 {
    public static void main(String[] args){
        int a=234;
        int b=12;
        System.out.println("before a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after a="+a+" b="+b);
    }
}
