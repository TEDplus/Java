
public class Product {
	//String name = "모나미 연필";
	//int price = 1000;
	//String maker = "모나미 회사";
	String name;
	int price;
	String maker;
	
	//메서드 오버로딩
	public Product() {} //Default constructor
	
	public Product(String name, int price, String maker) { // Default constructor
		this.name = name;
		this.price = price;
		this.maker = maker;;
	}
}
