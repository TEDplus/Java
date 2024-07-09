import java.util.Scanner;
public class SungjukMgmt1 {

	public static void main(String[] args) throws java.io.IOException{
		Student [] stdArray = new Student[3]; //앞으로 학생들의 정보가 저장될 공간 확보
		 java.util.Scanner sc = new java.util.Scanner(new java.io.File("sungjuk.dat"));
		for (int i = 0; i < 3; i++) {
//			System.out.println(sc.nextLine());
			stdArray[i] = new Student();  //비로소 여기서 학생 생성
			String line = sc.nextLine();  //"2024-001" "한지민" "100" "80" "70"
			//Parsing (split) 분할 tap 기준으로 자름
			String [] array = line.split("\\s+");
			stdArray[i].hakbun = array[0].trim(); //학번  trim 쓰면 "  한지민   " 한간격씩 자름
			stdArray[i].name = array[1].trim(); //이름
			stdArray[i].kor = Integer.parseInt(array[2].trim()); //국어 문자열 String 타입의 숫자를 int 타입으로 변환
			stdArray[i].eng = Integer.parseInt(array[3].trim()); //영어
			stdArray[i].math = Integer.parseInt(array[4].trim()); //수학
			
		} 
		int j = 0;  //초기화
		while(j < 3) {
			System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d%n",
					stdArray[j].hakbun, stdArray[j].name,
					stdArray[j].kor, stdArray[j].eng,
					stdArray[j].math);
			j++;
		}
	}

}
