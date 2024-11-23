import java.util.*;

public class Lab01_226 {

    public static void Eqn1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Format: ax + b = 0");
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        if(a!=0)
        {
            double res = -(double)b/(double)a;
            System.out.println("x = " + res);
        }
        else if(a==0 && b==0) System.out.println("INFINITE solutions.");
        else System.out.println("NO solutions.");
    }

    public static void Eqn2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Format: ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        int d = b*2 - 4*a*c;
        if(d==0)
        {
            double res = -(double)b/(double)(2*a);
            System.out.println("x = " + res);
        }
        else if(d<0) System.out.println("NO solutions.");
        else 
        {
            double x1, x2;
            x1 = (-b-Math.sqrt(d))/(2*a);
            x2 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void Eqn3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Format:\nax1 + bx2 = c\ndx1 + ex2 = f\n");
        System.out.print("Enter a: ");
        double a = scanner.nextInt();
        System.out.print("Enter b: ");
        double b = scanner.nextInt();
        System.out.print("Enter c: ");
        double c = scanner.nextInt();
        System.out.print("Enter d: ");
        double d = scanner.nextInt();
        System.out.print("Enter e: ");
        double e = scanner.nextInt();
        System.out.print("Enter f: ");
        double f = scanner.nextInt();

        double D = a * e - d * b;
        if(D!=0)
        {
            double Dx = c * e - f * b;
            double Dy = a * f - d * c;
            double x1 = Dx / D;
            double x2 = Dy / D;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (D==0 && a/d == c/f) System.out.println("INFINITE solutions.");
        else System.out.println("NO solutions.");
        
    }

    public static void main(String[] args) 
    {
        System.out.println(
            "Exit: Button 0\n"+
            "The first-degree equation with one variable: Press 1\n" +
            "The second-degree equation with one variable: Press 2\n" +
            "The system of first-degree equations with two variables: Press 3\n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 0) System.exit(0);
        else if(n==1) Eqn1();
        else if(n==2) Eqn2();
        else if(n==3) Eqn3();
    }
}
