package lang.print.gaps.task4;

import java.util.Scanner;

public class IntRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        double s = (9*a*a-5*b+2+a-7)*((a+b-(4*a*b))/2);
        System.out.println(s);
    }
}
