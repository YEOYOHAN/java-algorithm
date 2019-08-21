package study06;

public class Servic {
	public String getBmi(Member member) {
		String result = "";
		String name = member.getName();
		double heigth = member.getHeight();
		double weigth = member.getWeight();
		double bmi = weigth / (heigth*0.01 * heigth*0.01);
		String bmi2 = "";
		if(bmi > 30.0) {
			bmi2 = "고도비만";
		}else if(bmi > 25.0) {
			bmi2 = "비만";
		}else if(bmi > 23.0) {
			bmi2 = "과체중";
		}else if(bmi > 18.5) {
			bmi2 = "정상";
		}else {
			bmi2 = "저체중";
		}
		result = String.format("%s 님의 BMI는 %s 입니다.", name, bmi2);
		return result;
	}
	public String getReportCard(Member member) {
		String result = "";
		String pass ="";
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		String name = member.getName();
		int scores = kor + eng + math;
		int scores1 = scores / 3;
		if(scores1 >= 90) {
			pass = "장학생";
		}else if(scores1 >=70 && scores1 <90) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		result = String.format("이름    국어    영어    수학    총점    평균    합격여부 \n %s   %d   %d   %d   %d   %d   %s ",
				name, kor, eng, math, scores, scores1, pass);
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		String name = member.getName();
		int salary = member.getSalary();
		double tax = 9.7;
		double tax2 = salary * tax/100;
		result = String.format("%s 님의 납부하실 세금은 %.1f 입니다.", name, tax2);
		return result;
	}
}
