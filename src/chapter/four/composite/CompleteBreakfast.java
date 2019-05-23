package chapter.four.composite;

public class CompleteBreakfast implements ProductComposite {
	
	private String name;
	private ProductComposite desert;
	private ProductComposite coffeeAndBread;

	public CompleteBreakfast(String name, ProductComposite desert, ProductComposite coffeeAndBread) {
		this.name = name;
		this.desert = desert;
		this.coffeeAndBread = coffeeAndBread;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return coffeeAndBread.getPrice() + desert.getPrice();
	}

	@Override
	public void setPrice(Integer price) {}
}
