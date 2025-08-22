import java.util.*;
class Circle{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius of the circle:");
    float radius=sc.nextFloat();
    float pi=3.14f;
    float a=pi*radius*radius;
    System.out.println("the area of the circle is "+a);
}
}
