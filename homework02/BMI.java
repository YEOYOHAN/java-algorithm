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
		
		if(bmi > 18.5) {
			System.out.println("정상입니다.");
		}else if(bmi > 23) {
			System.out.println("과체중입니다.");
		}else if(bmi > 25) {
			System.out.println("비만 입니다.");
		}else if(bmi > 30) {
			System.out.println("고도 비만입니다.");
		}else {
			System.out.println("저체중입니다.");
		}
	}
}

