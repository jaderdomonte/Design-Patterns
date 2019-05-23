package chapter.four.chain.of.responsability;

public class ProposalValidator extends Validator {

	public ProposalValidator(Validator nextValidator) {
		super(nextValidator);
	}

	@Override
	protected void executeAllValidations() {
		validateDomains();
		validateCoverage();
	}
	
	private void validateDomains() {
		System.out.println("Validating Proposal domains");
	}
	
	private void validateCoverage() {
		System.out.println("Validating Proposal coverages");
	}
}
