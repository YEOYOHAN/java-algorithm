package study03;

import java.util.Scanner;

public class Student {
// 1. BMI 2. Ranking 3. HowMuch 4. ReportCard
	public String getBmi(String name, double kg, double cm) {
		String bmi2 = "";
		double height = cm * 0.01;
		double weight = kg;
		double bmi = weight/height*height;
		if(bmi > 18.5) {
			bmi2 = "정상";
		}else if(bmi > 23.0) {
			bmi2 = "과체중";
		}else if(bmi > 25.0) {
			bmi2 = "비만";
		}else if(bmi > 30) {
			bmi2 = "고도 비만";
		}else {
			bmi2 = "저체중";
		}
		return String.format("%s님의 BMI는 %s 입니다. \n", name, bmi2);
	}
	public void getRank() {
		System.out.println("2. Ranking");
		int numOfPlayer = 3;
		Scanner scan = new Scanner(System.in);
		double[] records = new double[numOfPlayer];
		String[] players = new String[] {"A" , "B" ,"C"};
		System.out.println("기록입력기");
		for(int i = 0 ;i < numOfPlayer; i++) {
			System.out.printf("%s 선수 기록>", players[i]);
			records[i] = scan.nextDouble();			
		}
		for(int i = 0 ;i < numOfPlayer ; i++) {
			for(int j = 0 ;  j <numOfPlayer -1; j++ ) {
				if(records[j] > records[j+1] ) {
					double tempDB = records[j];
					records[j] = records[j+1];
					records[j+1] = tempDB;
					
					String tempST = players[j];
					players[j] = players[j+1];
					players[j+1] = tempST;
					
				}
			}
		}

		for(int i = 0; i < numOfPlayer; i++) {
			System.out.printf("%d등: %s: 선수기록(%.1f) \n", i+1, players[i], records[i]   );
		}
	}
	public void HowMuch() {
		System.out.println("3. HowMuch");
		Scanner scan = new Scanner(System.in);
		boolean isRun = true;
		int price = 0, num = 0, result = 0 , over = 0;
		while(isRun) {
			System.out.println("자동주문기");
			System.out.println("1.계속  2.종료 ");
			over = scan.nextInt();
			if(over == 2) {
				break;
			}
			System.out.print("얼마에요?");
			price = scan.nextInt();
			System.out.printf("%d원 입니다", price);
			System.out.println();
			System.out.print("몇개드릴까요?");
			num = scan.nextInt();
			System.out.printf("%d개 주세요", num);
			result = price * num;
			System.out.printf("총 %d원 입니다." , result);
			int dc = result / 10;
			result -= dc; 
			System.out.printf("할인되어서 %d원입니다. \n" , result);
			System.out.printf("1. 계속    2. 종료 ");
			over = scan.nextInt();
			if(over == 2) {
				isRun = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	public void getReportCard() {
		System.out.println("3. getReportCard");
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		String pass ="" , name = "";
		System.out.print("이름입력>");
		name = scan.nextLine();
		System.out.println("점수입력(국, 영, 수)");
		for(int i = 0 ;i < 3; i++) {
			System.out.print("점수입력>");
			scores[i] = scan.nextInt();
		}
		scores[3] = scores[0] + scores[1] + scores[2];
		scores[4] = scores[3] / 3;
		if(scores[4] >= 90) {
			pass = "장학생";
		}else if(scores[4] >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		System.out.println("학생    국어    영어    수학    총점    평균    합격여부");
		System.out.println("=====================================");
		System.out.printf("%s  ",name);
		for( int i = 0 ; i < scores.length; i++) {
			System.out.printf("%d   ",scores[i]);
			
		}
		System.out.println(pass);
	}
}
