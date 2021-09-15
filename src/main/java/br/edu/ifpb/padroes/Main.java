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

		CompoundProperty cp = new CompoundProperty();
		PaymentService paymentService = new PaymentService();
		paymentService.loadProperty(

				new Apartment(new Float(100000), "Apartamento construtura", "Rua x"),
				new Bungalow(new Float(100000), "Bangal� construtura", "Rua y"),
				new Tenement(new Float(100000), "Corti�o construtura", "Rua y")

		);

		// TODO - reduzir chamadas múltiplas para uma única chamada para o método
		// pay() utilizando o padrão composite

		List<Property> p = cp.getChildren();
		paymentService.pay(p);
		
	}
}
