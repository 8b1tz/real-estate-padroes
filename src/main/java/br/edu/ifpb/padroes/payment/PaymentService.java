package br.edu.ifpb.padroes.payment;

import java.util.List;

import br.edu.ifpb.padroes.domain.CompoundProperty;
import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.processors.GovernmentTaxesPayment;
import br.edu.ifpb.padroes.payment.processors.PropertyPayment;
import br.edu.ifpb.padroes.payment.processors.RealEstatePayment;

public class PaymentService {

	private CompoundProperty allProperty = new CompoundProperty();

	public CompoundProperty getAllProperty() {
		return allProperty;
	}

	public void loadProperty(Property... propertys) {
		allProperty.clear();
		allProperty.add(propertys);
	}

	public void pay(List<Property> properties) {

		for (Property sale : properties) {

			PaymentProcessor p = new GovernmentTaxesPayment();
			p.linkWith(new RealEstatePayment()).linkWith(new PropertyPayment());
			p.process(sale);
		}
	}

}
