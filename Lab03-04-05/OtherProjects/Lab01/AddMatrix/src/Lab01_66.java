import java.util.*;

public class Lab01_66 {
    static void printMatrix(int M[][], int size)
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static int[][] add(int A[][], int B[][], int size)
    {
        int i, j;
        int C[][] = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter matrix A:");
        int A[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                A[i][j] = scanner.nextInt();
        }

        System.out.println("Enter matrix B:");
        int B[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                B[i][j] = scanner.nextInt();
        }

        int C[][] = add(A, B, size);

        // Print the result
        System.out.println("Matrix C:");
        printMatrix(C, size);
    }
}
