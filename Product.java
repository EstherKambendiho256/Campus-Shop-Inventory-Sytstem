package campusshop;

public class Product {
	private int Product_Id;
	private String Product_Name;
	private String Product_Category;
	private double Unit_Price;
	private int Quantity_In_Stock;

	// Constructor
	public Product(int Product_Id, String Product_Name, String Product_Category,double Unit_Price, int Quantity_In_Stock) {
		this.Product_Id = Product_Id;
		this.Product_Name = Product_Name;
		this.Product_Category = Product_Category;
		this.Unit_Price= Unit_Price;
		this.Quantity_In_Stock = Quantity_In_Stock;
		
	} 

	//getters
	public int getProduct_Id() {
		return Product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public String getProduct_Category() {
		return Product_Category;
	}
	public double getUnit_Price() {
		return Unit_Price;
	}
	public int getQuantity_In_Stock() {
		return Quantity_In_Stock;
	}

	//SETTERS
		public void setProduct_Id(int Product_Id ) {
			this.Product_Id = Product_Id;
		}
		public void setProduct_Name(String Product_Name) {
			this.Product_Name =Product_Name;
		}
		public void setProduct_Category(String Product_Category) {
			this.Product_Category =Product_Category;
		}
		public void setUnit_Price(double Unit_Price) {
			if (Unit_Price>=0) {
				this.Unit_Price = Unit_Price;
					}else {
					System.out.println("Invaild price! Price cannot be negative.");
					}
		}
		public void setQuantity_In_Stock(int Quantity_In_Stock) {
			if (Quantity_In_Stock>=0) {
				this.Quantity_In_Stock = Quantity_In_Stock;
						}else {
						System.out.println("Invaild stock! Quantity cannot be negative.");	
						}
			


	}

}
