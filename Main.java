import java.util.*;
public class Main
{
     public static boolean prime(int num){
	        for(int i=2;i<num;i++){
	            if(num%i==0)
	            return false;
	        }
	        return true;
	    }
	    
	   public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean ans=prime(n);
	    
	    if(ans==true){
	        System.out.println("prime");
	    }else{
	        System.out.println(" not prime");;;
	    }
	}
}