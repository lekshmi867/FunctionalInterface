package streamDeals;

import java.math.BigDecimal;
import java.time.Month;
import java.util.List;

public class DealMain {

	public static void main(String[] args) {
		List<Deal> deals = DealsExampleData.getDeals();
		
		deals.stream().filter(d->d.getType()==Type.ELECTRONIC).forEach(s->System.out.println(s));
		deals.stream().filter(d->d.getValidity().getMonth()==Month.APRIL).forEach(s->System.out.println(s));
		
		deals.stream().filter(d->d.getDiscount().compareTo(new BigDecimal("00.20"))<=0).forEach(s->System.out.println(s));
		
		deals.stream().filter(d->d.getProvider().equalsIgnoreCase("Apple")).forEach(s->System.out.println(s));
	
	}

	

	}

