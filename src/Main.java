import java.util.Scanner;

public class Main {

    private static final double MILE_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Project: ConverterM");
        System.out.println("Converts miles to kilometers");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        double km = convertMilesToKilometers(miles);
        System.out.println(miles + " miles = " + km + " kilometers");
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * MILE_TO_KM;
    }
}