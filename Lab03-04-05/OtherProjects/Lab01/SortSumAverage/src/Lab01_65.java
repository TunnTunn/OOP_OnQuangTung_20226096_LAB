import java.util.*;

public class Lab01_65 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        double avg = (double)sum/(double)n;
        Arrays.sort(a);

        System.out.print("Sorted array: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] +" ");
        }
        System.out.println("\nSum: "+sum);
        System.out.println("Average: " + avg);
    }
}
