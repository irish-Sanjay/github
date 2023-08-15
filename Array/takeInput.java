package Array;
import java.util.*;
public class takeInput {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     char abcd[]= new char[size]  ;

     //input

     for(int i=0; i<size; i++){
        abcd[i]= sc.nextline();
     }

     //output

     for(int i=0; i<size; i++){
        System.out.println(abcd[i]);
     }

    }      
}
