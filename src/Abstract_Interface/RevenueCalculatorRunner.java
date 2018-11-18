package Abstract_Interface;

public class RevenueCalculatorRunner {
    public static void main(String[] args) {
        final ClientEngagement clientEngagement = new ClientEngagement("Pluralsight", 100, 15_000);

        final double hourlyPrice = new HourlyRateCalculator(HourlyRateCalculator.STANDARD_HOURLY_RATE).calculate(clientEngagement);
        System.out.println(hourlyPrice);
    }
}
