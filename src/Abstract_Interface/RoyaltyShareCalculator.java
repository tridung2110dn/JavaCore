package Abstract_Interface;

public class RoyaltyShareCalculator implements IRevenueCalculator {
    public static final double STANDARD_ROYALTY_PERCENTAGE = 0.15;

    private final double royaltyPercentage;

    public RoyaltyShareCalculator(double royaltyPercentage) {
        this.royaltyPercentage = royaltyPercentage;
    }

    @Override
    public double calculate(ClientEngagement clientEngagement) {
        return royaltyPercentage * clientEngagement.getAnticipatedRevenue();
    }
}
