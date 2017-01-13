package fain;

import java.util.Scanner;



/**
 * Created by Serg on 02.01.2017.
 */
public class FriendsAndFamily {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        boolean kritExit=false;
        do{
            System.out.println("\n Enter list price: ");
            double listPrice=input.nextDouble();
            if(listPrice<=0){
                kritExit=true;
            }
            System.out.println(" Enter discount %: " );
            int discount=input.nextInt();
            System.out.println("You will price is: "
                    + listPrice+" discount: "
                    + discount + " total summ: "
                    + (listPrice - listPrice*(discount)/(100)));
        }while(!kritExit);
        System.out.println("Exit....");
    }
}
