package chapter.four.chain.of.responsability;

public abstract class Validator {
	
	private Validator nextValidator;
	
	public Validator(Validator nextValidator) {
		this.nextValidator = nextValidator;
	}

	public void validate() {
		executeAllValidations();
		callNextValidator();
	}
	
	protected void callNextValidator() {
		if(nextValidator == null) {
//			throw new RuntimeException("There no are validations to do...");
			return;
		}
		
		nextValidator.validate();
	}

	protected abstract void executeAllValidations();
}
