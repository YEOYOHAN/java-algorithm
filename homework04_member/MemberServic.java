package homework04_member;

public class MemberServic {
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
