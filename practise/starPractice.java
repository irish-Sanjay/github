package practise;
import java.util.*;

public class starPractice {
    public static void main(String args[]){
        int m=4;
        for(int i=1;i<=m;i++) {
            //space
            for (int j=m-i; j>=1; j--){
                System.out.print("  ");
            }
            //upper part
            for(int j=1;j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int i=m;i>=1;i--){
                // lower space
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }
            // lower part
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}