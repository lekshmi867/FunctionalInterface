package streamDeals;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DealsExampleData {

    private static final List<Deal> Deals = Arrays.asList(
    		new Deal("Manning", Type.BOOK, new BigDecimal("30.00"), new BigDecimal(".50"),
    				"Save 50% on Java 8 Books", LocalDate.of(2014, Month.MARCH, 20)),
    		new Deal("Amazon", Type.BOOK, new BigDecimal("20.00"), new BigDecimal(".20"),
    				"Save 20% on Clean Code", LocalDate.of(2014, Month.FEBRUARY, 10)),
    		new Deal("Kathy Pacific", Type.TRAVEL, new BigDecimal("300.00"), new BigDecimal(".40"),
    				"Save 40% on flight to USA", LocalDate.of(2014, Month.FEBRUARY, 19)),
    		new Deal("Luftanse", Type.TRAVEL, new BigDecimal("30.00"), new BigDecimal(".50"),
    				"Save 50% on flight to Berlin", LocalDate.of(2014, Month.MARCH, 27)),
    		new Deal("Trekking", Type.ACTIVITY, new BigDecimal("400.00"), new BigDecimal(".50"),
    				"Save 50% on Trekking", LocalDate.of(2014, Month.MARCH, 25)),
    		new Deal("Apple", Type.ELECTRONIC, new BigDecimal("800.00"), new BigDecimal(".10"),
    				"10% discount on iPhone 5S", LocalDate.of(2014, Month.APRIL, 19)),
    		new Deal("Samsung", Type.ELECTRONIC, new BigDecimal("700.00"), new BigDecimal(".20"),
    				"20% discount on Galaxy S4", LocalDate.of(2014, Month.MARCH, 18)),
    		new Deal("LG", Type.ELECTRONIC, new BigDecimal("390.00"), new BigDecimal(".50"),
    				"Save 40% on LG Smartphones", LocalDate.of(2014, Month.FEBRUARY, 17)),
    		new Deal("Sony", Type.ELECTRONIC, new BigDecimal("500.00"), new BigDecimal(".50"),
    				"Save 50% on Sony Viao Laptops", LocalDate.of(2014, Month.APRIL, 10)));

    public static List<Deal> getDeals() {
        return new ArrayList<>(Deals);
    }
}