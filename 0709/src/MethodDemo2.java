class product{
	int price;
}
public class MethodDemo2 {

	public static void main(String[] args) {
		MethodDemo2 md = new MethodDemo2();
		Product ballpen = new Product();  ballpen.price = 100;
		System.out.println("before = " + ballpen.price);
		md.change(ballpen.price); //call by reference
		int original = 100;
		//md.print(original); //call by value
		System.out.println("after = " + ballpen.price);
	}
	
	void change(product pencil) { //pencil = ballpen
		
	}
	
//	void print(int target) { //target = original
//		System.out.println("target = " + target);
//		target = 50000;
//		System.out.println("target = " +target);
//	}
}
