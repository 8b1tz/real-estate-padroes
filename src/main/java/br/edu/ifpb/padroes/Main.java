package br.edu.ifpb.padroes;

import java.util.List;

import br.edu.ifpb.padroes.domain.Apartment;
import br.edu.ifpb.padroes.domain.Bungalow;
import br.edu.ifpb.padroes.domain.CompoundProperty;
import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.domain.Tenement;
import br.edu.ifpb.padroes.payment.PaymentService;

public class Main {
	public static void main(String[] args) {

		PaymentService paymentService = new PaymentService();
		paymentService.loadProperty(

				new Apartment(new Float(100000), "Apartamento construtura", "Rua x"),
				new Bungalow(new Float(100000), "Bangalô construtura", "Rua y"),
				new Tenement(new Float(100000), "Cortiço construtura", "Rua y")

		);
		List<Property> p = (List<Property>) paymentService.getAllProperty();
		paymentService.pay(p);

	}
}
