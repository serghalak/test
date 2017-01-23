package mynode.lec4;

import java.util.Arrays;

/**
 * Created by Serg on 22.01.2017.
 */
public class TestNode {
    public static void main(String[] args){
        int[] n={1,2,3,4};
        //Node tail=createNode(n);
        Node tail=createNodeRec(n);
        System.out.println(toStringRec(tail));
//        while(true){
//            if(tail.node==null){
//                System.out.println(tail);
//                System.out.println("It's head");
//                break;
//            }else{
//                System.out.println(tail);
//                tail=tail.node;
//            }
//        }
    }
    public static Node createNode(int[] n){
        Node temp=null;
//                new Node(n[0],null);
//        temp=new Node(n[1],temp);
//        temp=new Node(n[2],temp);
//        temp=new Node(n[3],temp);
        for(int i=0;i<n.length;i++){
            temp=new Node(n[i],temp);
        }
        return temp;
    }
    public static Node createNodeRec(int[] n){
        Node temp;
        if(n.length==0) {
            return null;
        }else{
            return new Node(n[0],createNodeRec(Arrays.copyOfRange(n,1,n.length)));
        }
    }

    public static String toStringIter(Node tail){
        String result="";
        while(tail != null){
            result +=tail.number + " -> ";
            tail=tail.node;
        }
        return result +" * ";
    }
    public static String toStringRec(Node tail){

        if(tail == null){
            return  " * ";
        }else{
            return  tail.number +" -> " + toStringRec(tail.node);
        }
    }
}
