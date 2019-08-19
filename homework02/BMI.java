package homework02;
import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		double height = scan.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		double weight = scan.nextDouble();
		
		double bmi = weight / (height * height);
		String bmi2 = "";
		
		if(bmi > 18.5) {
			bmi2 = "정상";
		}else if(bmi > 23) {
			bmi2 = "과체중";
		}else if(bmi > 25) {
			bmi2 = "비만";
		}else if(bmi > 30) {
			bmi2 = "고도 비만";
		}else {
			bmi2 = "저체중";
		}
		System.out.printf("BMI는 %s 입니다.", bmi2);
	}
}

