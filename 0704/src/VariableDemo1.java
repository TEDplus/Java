
public class VariableDemo1 {
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("국어 점수 : ");
		String kor = sc.nextLine(); //"80" --> 80
		int ko = Integer.parseInt(kor);
		System.out.print("수학 점수 : ");
		String math = sc.nextLine(); //"70" --> 70
		int mat = Integer.parseInt(math);
		System.out.println(ko + mat);
		
	}
	
}
