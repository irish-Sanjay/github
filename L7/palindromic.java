package L7;

public class palindromic {
    public static void main(String args[]) {
        int n=5;
        for(int i=1; i<=n; i++) {
            //space
            for(int j =1; j<n-1; j++) {
                System.out.println(" ");   
            }
            for(int j=1; j<=n; j++){
            System.out.println(j+" ");
            }
        }
    }
    
}
