
public class Test_01 {

	public static void main(String[] args) {
		//A ~ Z까지 출력하기
//		int i = 65; //initialization
//		
//		for( ; i <=90; ) {
//			System.out.printf("%c\t", (char)i);
//			i++;
			int count = 0, line =1;
			for(int i = 65 ; i<=90 ; i++) {
				if(line % 2 == 0) System.out.print((char)(i + 32)+"\t");//소문자
				else System.out.print((char)(i) + "\t"); //대문자 출력
				count++;
				if(count % 5 == 0 ) {
					System.out.println(); line++;
				}
				
			}
		

	}
}
