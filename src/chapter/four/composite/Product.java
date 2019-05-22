package chapter.four.composite;

public class Product implements ProductComposite {
	
	private String name;
	private Integer price;

	public Product() {}

	public Product(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}

	@Override
	public void setPrice(Integer price) {
		this.price = price;
	}
}
