package campusshop;


public class Main {

	private static void displayproduct(Product product) {
		System.out.println("Product_Id:" + product.getProduct_Id());
		System.out.println("Product_Name:" + product.getProduct_Name());
		System.out.println("Product_Category:" + product.getProduct_Category());
		System.out.println("Unit_Price:" + product.getUnit_Price());
		System.out.println("Quantity_In_Stock:" + product.getQuantity_In_Stock());
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

	}
 
	public static void main(String[] args) {
		//creating five product objects
		Product product1 = new Product(101,"Exerices books","stationary", 4000,50);
		Product product2 = new Product(102,"Pens","stationary", 1000,100);
		Product product3 = new Product(103,"Printing paper","paper products", 15000,30);
		Product product4 = new Product(104,"flash disks","electronics", 30000,30);
		Product product5 = new Product(105,"Calculators","electronics", 100000,15);
		
		//storing products in an array
		Product[] products = {product1,product2,product3,product4,product5};
		//displaying all products
		System.out.println("Campus shop inventory system");
		System.out.println("Campus product details");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		
		for(Product product: products) {
			displayproduct(product);
		}
		//Updating product price using setter
		System.out.println("\nUpdating product information");
		
		product2.setUnit_Price(1500);
		//Updating stock quantity using setter
		product4.setQuantity_In_Stock(35);
		//displaying updated information 
		System.out.println("\nUpdated product details");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		
		displayproduct(product2);
		displayproduct(product4);
		
		//Demonstrating invalid input
		System.out.println("\nTesting invalid price");
		try {
			product1.setUnit_Price(-5000);
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				
			}
		System.out.println("\nProgram completed successfully");
		
	
	  }

		

	}


