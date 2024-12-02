import java.util.Scanner;

public class Lab01_63 {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2*n; j++)
            {
                if(j>=n-i && j<=n+i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
