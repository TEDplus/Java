
public class OverloadingDemo {

	public static void main(String[] args) {
		
	}
//	void change() {}
//	void change(char a) {}
//	void change(boolean a) {}
//	void change(int a) {}
//	void change(short a) {}
//	void change(double a) {}
	
	void change() {}
	void change(int a) {}
	void change(int b, String name) {}
	void change(String name, int b) {}

}
