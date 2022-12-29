package streamDeals;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Deal {

	private final String provider;
	private final Type type;
	private final BigDecimal price;
	private final BigDecimal discount;
	private final String title;
	private final LocalDate validity;

	public Deal(String provider, Type type, BigDecimal price, BigDecimal discount, String title, LocalDate validity) {
		this.provider = provider;
		this.type = type;
		this.price = price;
		this.discount = discount;
		this.title = title;
		this.validity = validity;
	}

	public String getProvider() {
		return provider;
	}

	public Type getType() {
		return type;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getValidity() {
		return validity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title).append(" from ").append(provider).append(", price : ").append(price)
				.append(", offer valid till ").append(validity).append(" category : ").append(type);
		return sb.toString();
	}
}
