package Student;

public class Product {
	int productId;
	String productName;
	static int Totalproducts;

	public static void main(String[] args) {
		Product product1= new Product();
		product1.productId=101;
		product1.productName="Abc";
		Totalproducts++;
		Product product2= new Product();
		product2.productId=102;
		product2.productName="Xyz";
		Totalproducts++;
        System.out.println("Product Id: "+product1.productId+" Product Name: "+product1.productName);
        System.out.println("Product Id: "+product2.productId+" Product Name: "+product2.productName);
		System.out.println("Total Products: "+Totalproducts);
			
	}

}
