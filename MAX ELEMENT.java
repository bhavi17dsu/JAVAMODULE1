import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int max=n[0];
        System.out.println("MAX ELEMENT");
        for(int num:n){
            if(num > max)max=num;
        }
        System.out.print(max);
    }
}
