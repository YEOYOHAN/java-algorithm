/**
 * To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
 */
package homework02;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.더하기, 2.빼기, 3.곱하기, 4.나누기중 선택해주세요 0은 종료: ");
			int Calculator = scanner.nextInt();
			switch(Calculator) {
			case 0:
				System.out.println("사용해주셔서 감사합니다.");
				return;
			case 1:
				System.out.print("처음수를 입력해주세요: ");
				int sum = scanner.nextInt();
				System.out.print("두번째수를 입력해주세요: ");
				int sum2 = scanner.nextInt();
				System.out.println("결과는 " + sum + "+" + sum2 + "=" + (sum+sum2) + " 입니다."); break;
			case 2:
				System.out.print("처음수를 입력해주세요: ");
				int Minus = scanner.nextInt();
				System.out.print("두번째수를 입력해주세요: ");
				int Minus2 = scanner.nextInt();
				System.out.println("결과는 " + Minus + "-" + Minus2 + "=" + (Minus-Minus2) + " 입니다."); break;
			case 3:
				System.out.print("처음수를 입력해주세요: ");
				int Mult = scanner.nextInt();
				System.out.print("두번째수를 입력해주세요: ");
				int Mult2 = scanner.nextInt();
				System.out.println("결과는 " + Mult + "*" + Mult2 + "=" + (Mult*Mult2) + " 입니다."); break;
			case 4:
				System.out.print("처음수를 입력해주세요: ");
				int div = scanner.nextInt();
				System.out.print("두번째수를 입력해주세요: ");
				int div2 = scanner.nextInt();
				int div3 = div % div2;
				System.out.println("결과는 " + div + "/" + div2 + "=" + (div/div2) + "["+div3+"]" + " 입니다."); break;
				default : break;
			}
		}

	}

}
