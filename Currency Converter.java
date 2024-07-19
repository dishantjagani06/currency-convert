import java.util.Scanner;

public class CurrencyConverter {

    // Conversion rates (as of current example)
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_GBP = 0.75;
    private static final double USD_TO_JPY = 110.21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for amount in USD
        System.out.print("Enter the amount in USD to convert: ");
        double usdAmount = scanner.nextDouble();

        // Convert to other currencies
        double eurAmount = convertUSDToEUR(usdAmount);
        double gbpAmount = convertUSDToGBP(usdAmount);
        double jpyAmount = convertUSDToJPY(usdAmount);

        // Display results
        System.out.println(usdAmount + " USD is equal to:");
        System.out.println(eurAmount + " EUR");
        System.out.println(gbpAmount + " GBP");
        System.out.println(jpyAmount + " JPY");

        scanner.close();
    }

    // Methods to convert from USD to other currencies
    private static double convertUSDToEUR(double usd) {
        return usd * USD_TO_EUR;
    }

    private static double convertUSDToGBP(double usd) {
        return usd * USD_TO_GBP;
    }

    private static double convertUSDToJPY(double usd) {
        return usd * USD_TO_JPY;
    }
}
