package chapter.four.chain.of.responsability;

public class ClientValidator extends Validator {

	public ClientValidator(Validator nextValidator) {
		super(nextValidator);
	}

	@Override
	protected void executeAllValidations() {
		validateDomains();
		validateCoverage();
	}
	
	private void validateDomains() {
		System.out.println("Validating Client domains");
	}
	
	private void validateCoverage() {
		System.out.println("Validating Client coverages");
	}
}
