package homework03;

import java.util.Scanner;

public class Engine {

	@SuppressWarnings({ "null", "unused" })
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
				/**int in = 0;
				System.out.print("더하시려는 숫자를 입력하세요(종료는 -1) \n>");
				in = scanner.nextInt();
				String result2 = student.getScoreCalc(in);
				System.out.println(result2);
				*/
				break;//가동 불가
			
			case 4 : System.out.println("ReportCard");
				/**System.out.println("학생의 이름을 입력해주세요.");
				name = scanner.next();
				System.out.println("학생의 점수를 입력해주세요.");
				String[] subjects = {"국어", "영어", "수학"};
				for(int i = 0 ;i < 3; i++) {
					System.out.print("점수입력>");
					int[] scores = null;
					scores[i] = scanner.nextInt();
				System.out.printf(" %s 점수를 입력하세요: ", subjects[i]);
				int scores1 = scanner.nextInt();
				String result3 = student.getReportCard(name, subjects, scores1);
				System.out.println(result3);
				 */
			break;//가동 불가
			
			case 5 : System.out.println("Ranking");
				break;//모르겠음
				
			case 6 : System.out.println("PassOrFail");
				break;//모르겠음
				
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
			}
		}

	}


}
