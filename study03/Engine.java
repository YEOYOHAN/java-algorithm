package study03;
import study03.Student;
import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int flag = 0;
		while(true) {
			System.out.println("메뉴 : 0.종료 1.BMI 2.Ranking 3.HowMuch"
					+ "4.ReportCard");
			flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료");
				return;
			case 1 : System.out.println("BMI");
				
				double cm = 0.0, kg = 0.0;
				System.out.print("이름을 입력하세요: ");
				String name = scanner.next();
				System.out.print("키를 입력하세요: ");
				double height = scanner.nextDouble();
				System.out.print("몸무게를 입력하세요: ");
				double weight = scanner.nextDouble();
				String result = student.getBmi(name, kg, cm);
				System.out.println(result);
				break;
			case 2 : System.out.println("Ranking");
				student.getRank();
				break;
			case 3 : System.out.println("HowMuch");
				student.HowMuch();
				break;
			case 4 : System.out.println("ReportCard");
				student.getReportCard();
				break;
			}
		}

	}

}
