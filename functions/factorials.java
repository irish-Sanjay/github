package functions;
import java.util.*;

public class factorials {
    public static int factorials(int n){
        if (n<0){
            System.out.println("invalid number");
return n ; 
        }
       int factorials =1;
       for(int i=n; i>1; i--){
        factorials= factorials*i;

       }
       System.out.println(factorials);
       return n ;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorials (n));
    }
}
