package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int flag = 0;
		while(true) {
			System.out.println("0.종료 1.TimeCalc 2.Tax 3.ScoreCalc 4.ReportCard 5.Ranking 6.PassOrFail"
					+ "7.MonthEndDay 8.LeapYear 9.Join 10.HowMuch 11.BMI 12.AC");
			flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료합니다.");
				return;
			case 1 : System.out.println("TimeCalc");
				System.out.println("시간을 입력하세요: ");
				int time = scanner.nextInt();
				String result = student.getTimeCalc(time);
				System.out.println(result);
	        	break;
	        	
			case 2 : System.out.println("Tax");
				System.out.println("이름을 입력해주세요");
				String name = scanner.next();
				System.out.println("연봉을 입력해주세요");
				int money = scanner.nextInt();
				String result1 =  student.getTax(name, money);
				System.out.println(result1);
				break;
			
			case 3 : System.out.println("ScoreCalc");
				int count = 0;
				int[] numbers = null;
				while(true) {
				System.out.println("숫자입력 (-1종료)");
				int sc = scanner.nextInt();
				if(sc == -1) {
					break;
				}
				int[] temp = new int[count];
				for(int i = 0; i < count ; i++) {
					temp[i] = numbers[i];
					
				}
				count ++;
				numbers = new int[count];
				for(int i = 0 ;i <count-1 ; i++) {
					numbers[i] = temp[i];
					
				}
				numbers[count-1] = sc;
				}
				String result2 = student.getScoreCalc(numbers);
				System.out.println(result2);
				break;
			
			case 4 : System.out.println("ReportCard");
				int[] scores = new int[5];
				System.out.println("이름>");
				name = scanner.next();
				System.out.println("점수입력(국 영 수)");
				for(int i = 0 ;i <3; i++) {
				scores[i] = scanner.nextInt();
				}
				String result3 = student.getReportCard(name, scores);
				System.out.println(result3);
				break;
			
			case 5 : System.out.println("Ranking");
				double[] records = new double[3];
				System.out.println("기록측정");
				System.out.print("시간입력>");
				for(int i = 0; i < 3; i++) {
					records[i] = scanner.nextDouble();
				}
				String result4 = student.Ranking(records);
				System.out.println(result4);
				break;
				
			case 6 : System.out.println("PassOrFail");
				scores = new int[5];
				System.out.print("이름>");
				name = scanner.next();
				System.out.print("점수입력");
				String resuli5 = student.PassOrFail(name, scores);
				System.out.println(resuli5);
				
			case 7 : System.out.println("MonthEndDay");
				System.out.print("월을 입력하세요 1~12");
				int year = scanner.nextInt();
				String result7 = student.getMonthEndDay(year);
				System.out.println(result7);
				break;
				
			case 8 : System.out.println("LeapYear");
				System.out.println("알고싶은 년도를 입력해주세요.(숫자 4자리)");
				year = scanner.nextInt();
				String result8 = student.getLeapYear(year);
				System.out.println(result8);
				break;
				
			case 9 : System.out.println("Join");
				System.out.println("==== 회원가입 ====");
				System.out.print("아이디:>");
				String id = scanner.next();
				System.out.print("비밀번호>");
				String pw = scanner.next();
				System.out.print("이름>");
				name = scanner.next();
				System.out.print("생년월일(예) 1980-01-01 >");
				String birth = scanner.next();
				System.out.print("성인여부(성인true, 미성년false)>");
				boolean isAdult = scanner.nextBoolean();
				System.out.print("키(소수점 첫째자리까지)>");
				double height = scanner.nextDouble();
				System.out.print("몸무게(소수점 첫째자리까지)>");
				double weight = scanner.nextDouble();
				System.out.print("혈액형(A)>");
				String blood = scanner.next();
				String result9 = student.Join(id, pw, name, birth, blood, height, weight);
				System.out.println(result9);
				
			case 10 : System.out.println("HowMuch");
				int price = 0, num = 0;
				System.out.print("얼마에요?");
				price = scanner.nextInt();
				System.out.println("몇개드릴까요?");
				num = scanner.nextInt();
				String result10 = student.HowMuch(price, num);
				System.out.println(result10);
				break;
				
			case 11 : System.out.println("BMI");
				System.out.println("이름을 입력해주세요");
				name = scanner.next();
				System.out.print("키를 입력하세요: ");
				height = scanner.nextDouble();
				System.out.print("몸무게를 입력하세요: ");
				weight = scanner.nextDouble();
				String result11 = student.getBmi(name, height, weight);
				System.out.println(result11);
				break;
				
			case 12 : System.out.println("AC");
				String op="";
				System.out.println("연산기");
				System.out.print("연산 입력>");
				int n1 = scanner.nextInt();
				op = scanner.next();
				int n2 = scanner.nextInt();
				String result12 = student.getAc(op, n1, n2);
				System.out.println(result12);
				break;
			}
		}

	}
}
