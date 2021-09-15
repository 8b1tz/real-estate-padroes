package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;

public class RealEstatePayment extends PaymentProcessor {

	@Override
	public void process(Property property) {
		double realStateComission = property.getPrice() * 0.10;
		System.out.println(String.format("Pay %f for real state", realStateComission));
	}

	@Override
	public boolean check(float price, String address, String builder) {
		if (price > 0 && (address != "" || address != null) && (builder != "" || builder != null)) {
			return checkNext(price, address, builder);
		}
		return false;
	}
}
