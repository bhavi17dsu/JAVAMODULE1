import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int temp=n[0];
        n[0]=n[n.length-1];
        n[n.length-1]=temp;
        System.out.println("after swapping first and last: "+java.util.Arrays.toString(n));
    }
}
            
