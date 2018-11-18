package Abstract_Interface;

import java.util.Arrays;
import java.util.List;

public class SalesPredictor {

    public static void main(String[] args) {
        final List<ClientEngagement> engagements = Arrays.asList(
                new ClientEngagement("Catherine's Cookies", 40, 40_000),
                new ClientEngagement("Bob's Burgers", 40, 40_000),
                new ClientEngagement("Dave's Doughnuts", 40, 40_000),
                new ClientEngagement("Susan's Sausages", 40, 40_000));
    }
}
