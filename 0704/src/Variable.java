
public class Variable {
	public static void main(String[]args) {
//		String name;  //variable Declration
//		name = "한지민"; //Assignment
//		String email = "aaa@aaa.com"; //initialization
//		int su = 5; //2진수로 저장
		
//		System.out.printf("숫자 500 = %d\n", 500);
//		System.out.printf("숫자 500 = %o\n", 500);
//		System.out.printf("숫자 500 = %x\n", 500);
//		short a = 5; //오류 안나는 이유 : 비트에서 앞에 0들을 쭉 자동 지워져서  128일때 8비트로 3바이트가 되서 오류남
//		short b =7;
//		short sum = 5 + 7;
//		System.out.println(sum);
		
//		float f = 0.1234567890123456789f;
//		double d = 0.1234567890123456789;
//		System.out.println("f = " + f);
//		System.out.println("d = " + d);
		
		
//		System.out.print('A');
//		System.out.print('B');
//		System.out.print('\n');
//		System.out.print('C');
//		System.out.print('D');
//		System.out.print('\b');
//		System.out.print('E');
		
		
		//System.out.println(sum);
		
//		System.out.println(true);
//		System.out.println(false);
//		System.out.println(4 != 5);
//		System.out.println("Hello, World");
		
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		//String name = "한지민"; 
		//부모 자식 형변환도 아닌 둘다 스트링인데 왜 좌우가 같은데 type을  왜 써주는지 ? 시작주소만 가지고 byte거리만큼가니 
		//그거리를 어느정도 byte거리 내가 가리키는곳 까지 거리만 나타내랴고 type을 써준다.연관 c언어에 포인터 (시작주소를 가지고 가고 끝주소는 모름)
		
		//메모리 할당: 각 데이터 타입은 메모리에서 차지하는 크기가 다를 수 있습니다. 예를 들어, 
		//String 타입은 여러 문자들의 시퀀스를 저장할 수 있는 객체 타입이며, 메모리에서는 해당 문자열의 길이와 구조를 관리하기 위해 필요한 추가 정보를 포함
		
//		byte x = 10;
//		byte y = 20;
//		byte sum = x + y; XXXXXXXXXXXXXX
//		int sum = x + y;
		
		short x = 10;
		short y = 20;
		short sum = (short)(x + y);
		
		
	}
}


