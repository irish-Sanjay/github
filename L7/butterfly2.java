package L7;

public class butterfly2 {
    public static void main(String args[]) {
        int n= 4;
        for( int i=n; i>=1; i--) {
            // 1 part star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //1 part space
        for(int j=(n-i)*2; j>= 1; j--) {
            System.out.print("  ");
        }
        //2 part star
        for (int j=1; j<=i; j++) {
            System.out.print("* ");
        }
        System.out.println();
        }
            }
        }
