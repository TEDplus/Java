
public class OpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//short su = 5;
		//short result = ~su;  //XXXX int가 들어가야됨
		//int result = ~su;
		
		//short result = true ? 1970 : 3.14;
	
		
		
		

//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		String second = sc.nextInt(Z +"초는" + X + "시간" + Y +"초입니다."); 
//		int  = Integer.parseInt(second);
//		
//		System.out.printf(Z +"초는" + X + "시간" + Y +"초입니다.");
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int X = 1*60*60;
//		int Y = 1;
//		int Z = (int)(X+Y);
//		System.out.print("X");
//		String second = sc.nextLine(); 
//		int se = Integer.parseInt(second);
//		System.out.print("Y");
//		String second2 = sc.nextLine(); 
//		int se2 = Integer.parseInt(second2);
//		System.out.print("Z");
//		String second3 = sc.nextLine(); 
//		int se3 = Integer.parseInt(second3);
//		System.out.println(se3 +"초는" + se2 + "시간" + se +"초입니다.");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("값 입력(초단위):");
		int time = sc.nextInt();
		int hours = time / 3600;
		int minutes = time % 3600 / 60;
		int seconds = time % 3600 % 60;
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.\n", time, hours, minutes, seconds);
		
		
	}

}
