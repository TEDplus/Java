import java.util.Scanner;

public class Year1 {

	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("year: ");
		int year = sc.nextInt();
		if(year % 400 == 0 | (year % 4 == 0 & year % 100 !=0)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
			sc.close();
		}	
			
		
		
	}

}
