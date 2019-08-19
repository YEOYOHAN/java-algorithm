package homework02;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
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
}