

//Method를 호출 하는 방법 3가지
//1)Call(Pass)by Name
//2)Call(pass)by Value
//3)call(pass)by Reference


public class MethodDemo4 {

	public static void main(String[] args) {
	 MethodDemo4 md = new MethodDemo4(); 
	 int result = md.calcHap(10, 50);
	System.out.println(result);
	 md.calcHap(1, 100);
	 System.out.println(result);
	 md.calcHap(50, 70);
	 System.out.println(result);
	}
	int calcHap(int start, int end){ //member method
	int hap = 0;
	for(int i = start; i < end; i++) {
		hap +=i;
	}
	return hap;
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