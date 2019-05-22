package chapter.four.composite;

public class CompositeTest {

	public static void main(String[] args) {
		ProductComposite bread = new Product("Bread", 8);
		ProductComposite coffee = new Product("Coffee", 4);

		System.out.println("Bread price: "+bread.getPrice());
		System.out.println("Coffee price: "+coffee.getPrice());
		
		ProductComposite breakfast = new KitBreakfast("Breakfast", bread, coffee);
		System.out.println("Breakfast price: "+breakfast.getPrice());
	}
}
