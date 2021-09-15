package br.edu.ifpb.padroes.payment;

public abstract class PaymentProcessor implements PaymentProcessorHandler {

	private PaymentProcessor next;

	public PaymentProcessor linkWith(PaymentProcessor next) {
		this.next = next;
		return next;
	}

	public abstract boolean check(float price, String address, String builder);

	protected boolean checkNext(float price, String address, String builder) {
		if (next == null) {
			return true;
		}
		return next.check(price, address, builder);
	}

}
