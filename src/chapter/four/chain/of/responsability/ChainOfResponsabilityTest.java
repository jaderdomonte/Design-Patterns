package chapter.four.chain.of.responsability;

public class ChainOfResponsabilityTest {

	public static void main(String[] args) {
		Validator clientValidator = new ClientValidator(null);
		Validator proposalValidator = new ProposalValidator(clientValidator);
		
		proposalValidator.validate();
	}
}
