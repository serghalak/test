package mynode.lec4;

/**
 * Created by Serg on 22.01.2017.
 */
public class TestNode {
    public static void main(String[] args){
        int[] n={1,2,3,4};
        Node tail=createNode(n);
        while(true){
            if(tail.node==null){
                System.out.println(tail);
                System.out.println("It's head");
                break;
            }else{
                System.out.println(tail);
                tail=tail.node;
            }
        }
    }
    public static Node createNode(int[] n){
        Node temp=new Node(n[0],null);
        temp=new Node(n[1],temp);
        temp=new Node(n[2],temp);
        temp=new Node(n[3],temp);

        return temp;
    }
}
