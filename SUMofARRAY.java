import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        int sum=0;
        System.out.println("enter five numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
        }
        System.out.println("sum of numbers is "+sum);
        float avg=sum/n.length;
        System.out.println("Average is "+avg);
    }
}
