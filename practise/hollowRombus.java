package practise;

import javax.print.event.PrintEvent;

public class hollowRombus {
    public static void main(String args[]){
int m=5;
for(int i=1;i<=m;i++){
    for(int j=m-i;j>=1;j--){
        System.out.print(" ");
    }
    for(int j=1;j<=m;j++){
        if (i==1||j==1||i==m||j==m){
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

    }
    System.out.println();
}
    }
}
