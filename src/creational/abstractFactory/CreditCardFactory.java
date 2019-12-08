package creational.abstractFactory;

//AbstractFactory
public abstract class CreditCardFactory {

	static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 650) {
			return new AmexFactory();
		}
		return new VisaFactory();
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
