import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>50){
                count++;
            }
        }
        System.out.println("there are "+count+" numbers greater than 50 in this array");
    }
}
