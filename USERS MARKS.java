import java.util.*;
class marks{
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your first subject marks:");
    int a=sc.nextInt();
    System.out.println("enter your second subject marks:");
    int b=sc.nextInt();
    System.out.println("enter your third  subject marks:");
    int c=sc.nextInt();
    int total=a+b+c;
    int n=3;
    int avg=total/n;
    System.out.println("the total is="+ total);
    System.out.println("the average of the marks is: "+avg);
}
}
