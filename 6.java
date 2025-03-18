import java.util.*;
class A{
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     if(a>b && a>c){
        System.out.println("Greater is " +a);
     }
     else if(b>a && b>c){
        System.out.println("Greater is " +b);
    }
    else{
       System.out.println("Greater is " +c);
    }
 }
}