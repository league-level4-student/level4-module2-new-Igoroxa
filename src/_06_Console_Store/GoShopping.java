package _06_Console_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
//		Cart<Candy> sweetcart = new Cart<Candy>();
//		// 3. Create another Cart object of type Cereal
//		Cart<Cereal> serialcart = new Cart<Cereal>();
//		// 4. Add a few items to EACH cart
//		Candy milkyway = new Candy();
//		Candy snickers = new Candy();
//		sweetcart.add(milkyway);
//		sweetcart.add(snickers);
//		Cereal loops = new Cereal();
//		Cereal cheerios = new Cereal();
//		serialcart.add(cheerios);
//		serialcart.add(loops);
//		
		
		// 5. Call the showCart() method on EACH cart
//		sweetcart.showCart();
//		serialcart.showCart();
//		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		Cart<Toy> playcart = new Cart<Toy>();
		Cart<Clothing> clothcart = new Cart<Clothing>();
		
		Toy lego = new Toy();
		Toy hotwheel = new Toy();
		playcart.add(hotwheel);
		playcart.add(lego);
		Clothing shirt = new Clothing();
		Clothing shorts = new Clothing();
		clothcart.add(shorts);
		clothcart.add(shirt);
		playcart.showCart();
		clothcart.showCart();
		
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
