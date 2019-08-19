package homework02;
import java.util.Scanner;
public class MonthEndDay {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = 0, days = 0;
		System.out.print("월을 입력하세요>");
		input = scan.nextInt();
		while(input > 12) {
			System.out.println("잘못된 값입니다");
			System.out.println("재입력해주세요");
			System.out.print("월을 입력하세요>");
			input = scan.nextInt();
		}
		switch(input) {
		case 2: days = 29;break;
		case 4:
		case 6:
		case 9:
		case 11: days = 30; break;
		default: days = 31 ; break;
		}
		System.out.printf("%d월은 %d일 까지 입니다." , input, days);
	}
}