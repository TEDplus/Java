
//Method를 호출 하는 방법 3가지
//1)Call(Pass)by Name
//2)Call(pass)by Value
//3)call(pass)by Reference


public class MethodDemo {

	public static void main(String[] args) {
	 MethodDemo md = new MethodDemo(); md.calcHap();
	}
	void calcHap(){ //member method
	int hap = 0;
	for(int i = 1; i < 101; i++) {
		hap +=i;
	}
	System.out.println("1부터 100까지의 합은" + hap + "입니다.");
  }
}

//Naming Convention
/*
*
* 1. PascalCasing : Class, Interface, Enum
* 2. camelCasing : variable(변수), method(상수)
* 3. Snake_Casing 
* 4. Kebbab-Casing
*
*/