import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("ODD NUMBERS");
        for(int num:n){
            if(num % 2 !=0){
               System.out.print(num+" ");
            }
        }
    }
}
