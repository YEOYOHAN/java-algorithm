package study05;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Servic servic = new Servic();
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기 3.아이디찾기 4.BMI 5.ReportCard 6.Tax");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");
				return;
			case 1 :
				member = new Member();
				String name, id, pw, ssn, blood;
				double height, weight;
				System.out.println("==== 회원가입 ====");
				System.out.print("아이디:>");
				member.setId(scanner.next());
				System.out.print("비밀번호>");
				member.setPw(scanner.next());
				System.out.print("이름>");
				member.setName(scanner.next());
				System.out.print("주민번호");
				member.setSsn(scanner.next());
				System.out.print("키>");
				member.setHeight(scanner.nextDouble());
				System.out.print("몸무게>");
				member.setWeight(scanner.nextDouble());
				System.out.print("혈액형>");
				member.setBlood(scanner.next());
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				System.out.println("영어점수");
				member.setEng(scanner.nextInt());
				System.out.println("수학점수");
				member.setMeth(scanner.nextInt());
				System.out.println("연봉");
				member.setSalary(scanner.nextInt());
				break;
				
			case 2 : 
				System.out.println(member.toString());
				break;
				
			case 3 :
				System.out.println("이름을 입력하면 아이디 알려줌");
				String searchName = scanner.next();
				String searchId = scanner.next();
				if(searchName.equals(member.getName()) &&
					searchId.equals(member.getId())){
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호: %s \n" + member.getId() + member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
				}
			case 4 :
				System.out.println("BMI 구하기");
				System.out.println(servic.getBmi(member));
				break;
				
			case 5 :
				System.out.println("ReportCard");
				System.out.println(servic.getReportCard(member));
				break;
				
			case 6 : 
				System.out.println("Tax");
				System.out.println(servic.getTax(member));
				break;
			}
		}

	}

}
