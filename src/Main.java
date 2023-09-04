import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double degrees = Double.parseDouble(scanner.nextLine());
        double rounded = Math.round(degrees);

        System.out.printf("Today in %s it is %.2f degrees", city, rounded);
    }
}
