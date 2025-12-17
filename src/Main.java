import java.util.Scanner;

public class Main {
    static final double MILE_TO_KM = 1.60934;
    static final double KM_TO_MILE = 0.621371;

    public static void main(String[] args) {
        System.out.println("Project: ConverterM");
        System.out.println("Converts miles to kilometers");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        double kmConverted = convertMilesToKilometers(miles);
        System.out.println(miles + " miles = " + kmConverted + " kilometers");

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        double milesConverted = convertKilometersToMiles(km);
        System.out.println(km + " kilometers = " + milesConverted + " miles");
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * MILE_TO_KM;
    }

    private static double convertKilometersToMiles(double km) {
        return km * KM_TO_MILE;
    }
}
