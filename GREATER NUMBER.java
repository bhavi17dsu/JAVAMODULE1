import java.util.*;
class greaternumber{
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your first number:");
    int a=sc.nextInt();
    System.out.println("enter your second number:");
    int b=sc.nextInt();
    if(a>b){
    System.out.println("the greater number is :"+ a);
    }
    else if(b>a){
    System.out.println("the greater number is :"+ b);
    }
    else{
    System.out.println("the numbers are equal");
    }
}
}
