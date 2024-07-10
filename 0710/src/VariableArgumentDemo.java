
public class VariableArgumentDemo {

	public static void main(String[] args) {
		VariableArgumentDemo vad =new VariableArgumentDemo();
		int a = 5, b = 7, c = 9, d = 10, e = 1000;
		char f = 'B';
		boolean g = true;
		double avg = 89.5;
		String name = "한지민";
		
		vad.change(a,b,c,d,e,f,g,avg,name); //argument, 인자(인수)
	}
	void change(Object...A) { //parameter, 매개변수  A는 배열 배열로 받았다...  여러개의 정수,실수,캐릭,불린 모두는 Object로 받음
		System.out.println(A.length);
		for(Object su : A) {   //Object 받는사람은 형태를 알수없어서 문제가 발생할수있음
			System.out.println(su);
		}
	}
}
