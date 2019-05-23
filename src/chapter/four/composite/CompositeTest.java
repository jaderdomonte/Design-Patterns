package chapter.four.composite;

public class CompositeTest {

	public static void main(String[] args) {
		ProductComposite bread = new Product("Bread", 8);
		ProductComposite coffee = new Product("Coffee", 4);
		ProductComposite desert = new Product("Desert", 8);

		System.out.println("Bread price: "+bread.getPrice());
		System.out.println("Coffee price: "+coffee.getPrice());
		
		ProductComposite coffeeAndBread = new CoffeeAndBread("Breakfast", bread, coffee);
		System.out.println("Coffee and Bread price: "+coffeeAndBread.getPrice());
		
		CompleteBreakfast completeBreakfast = new CompleteBreakfast("Complete Breakfast", desert, coffeeAndBread);
		System.out.println("Complete Breakfast price: "+completeBreakfast.getPrice());
	}
}
