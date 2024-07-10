public class SungjukMgmt {

    public static void main(String[] args) {
        Student younghee = new Student(); 
        
        new Input().input(younghee);
        new Calc().calc(younghee);
        new Output().output(younghee);
        
        
    }
}

//    void input(Student std) { // std = younghee, call by reference
//        java.util.Scanner sc = new java.util.Scanner(System.in); 
//        System.out.print("학번 : ");
//        std.hakbun = sc.next();
//        System.out.print("국어 : ");
//        std.kor = sc.nextInt();
//        System.out.print("영어 : ");
//        std.eng = sc.nextInt();
//        System.out.print("수학 : ");
//        std.math = sc.nextInt();
//    }
//
//    void calc(Student std) {
//        std.tot = std.kor + std.eng + std.math;
//        std.avg = std.tot / 3.; 
//        std.grade = (std.avg >= 90) ? 'A' : (std.avg >= 80) ? 'B' :
//                (std.avg >= 70) ? 'C' : (std.avg >= 60) ? 'D' : 'F'; 
//    }
//
//    void output(Student std) {
//        System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
//        System.out.println("-----------------------------------------------------");
//        System.out.printf("%-10s%5d%5d%5d%5d%7.1f%5c%n",
//                std.hakbun, std.kor, std.eng, std.math, std.tot, std.avg, std.grade); 
//    }
//}


