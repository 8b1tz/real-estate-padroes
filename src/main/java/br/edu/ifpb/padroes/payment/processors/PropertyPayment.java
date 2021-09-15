package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;

public class PropertyPayment extends PaymentProcessor {
	@Override
	public void process(Property property) {
		double propertyDeed = property.getPrice();
		System.out.println(String.format("Pay %f for the property", propertyDeed));
	}

	@Override
	public boolean check(float price, String address, String builder) {
		if (price > 0 && (address != "" || address != null) && (builder != "" || builder != null)) {
			return checkNext(price, address, builder);
		}
		return false;
	}

}
