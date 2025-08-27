import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int copyArr[]=new int[n.length];
        for(int i=0;i<n.length;i++){
            copyArr[i]=n[i];
        }
        System.out.println("duplicate array: "+java.util.Arrays.toString(copyArr));
    }
}
