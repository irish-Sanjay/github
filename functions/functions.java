package functions;
import java.util.*;

public class functions {
public static int product(int a, int b){
    return (a*b);
}    
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int b = sc.nextInt();
System.out.println("product of two number is :" + product(a,b));
}
}
