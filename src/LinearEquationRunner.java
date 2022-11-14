import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome " + "\n" + "Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        int space = coord1.indexOf(" ");
        int comma = coord1.indexOf(",");
        String x1 = coord1.substring(1,comma);
        String y1 = coord1.substring(space + 1, coord1.length() - 1);
        int xx1 = Integer.parseInt(x1);
        int yy1 = Integer.parseInt(y1);

        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int space2 = coord1.indexOf(" ");
        int comma2 = coord1.indexOf(",");
        String x2 = coord1.substring(1,comma2);
        String y2 = coord1.substring(space2 + 1, coord2.length() - 1);
        int xx2 = Integer.parseInt(x2);
        int yy2 = Integer.parseInt(y2);

        if (xx1 == xx2) {
            System.out.print("The points are on a vertical line: x = " + xx2);
        } else {
            LinearEquation equation = new LinearEquation(xx1, yy1, xx2, yy2);
            System.out.println("----- Line Info -----");
            System.out.println(equation.info());
            System.out.print("Enter a value for x");
            double x = scan.nextDouble();
            System.out.println(equation.Xcoord(x));

        }

    }
}
