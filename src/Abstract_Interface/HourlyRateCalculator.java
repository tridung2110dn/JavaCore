package Abstract_Interface;

public class HourlyRateCalculator implements IRevenueCalculator {

    public static final double STANDARD_HOURLY_RATE = 50;

    private final double hourlyRate;

    public HourlyRateCalculator(final double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculate(final ClientEngagement clientEngagement) {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
