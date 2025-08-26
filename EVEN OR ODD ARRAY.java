import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("count of even numbers is "+ even);
        System.out.println("count of odd numbers is "+odd);
    }
}
