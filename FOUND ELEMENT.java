import java.util.*;
class array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter numbers:");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("ENTER THE ELEMENT TO SEARCH: ");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n.length;i++){
            if(n[i] == search){
                System.out.println("element found");
                found=true;
                break;
            }
        }
        if(!found){
        System.out.println("element "+search+" not found");
        }
    }
}
