package chapter.four.composite;

public class KitBreakfast implements ProductComposite {

	private String name;
	private ProductComposite bread;
	private ProductComposite coffee;

	public KitBreakfast(String name, ProductComposite bread, ProductComposite coffee) {
		this.name = name;
		this.bread = bread;
		this.coffee = coffee;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return bread.getPrice() + coffee.getPrice();
	}

	@Override
	public void setPrice(Integer price) {}

	public ProductComposite getBread() {
		return bread;
	}

	public ProductComposite getCoffee() {
		return coffee;
	}
}
