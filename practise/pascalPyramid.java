package practise;
import java.util.*;
public class pascalPyramid {
    public static void main (String args[]) {
        int m=5;
        for(int i=1;i<=m;i++){
            // space
            for(int j=m-1;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--) {
            System.out.print(j +" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}