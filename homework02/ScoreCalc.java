package homework02;
import java.util.Scanner;
public class ScoreCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수계산기");
		int count = 0, input = 0;
		int[] numbers = null;
		
		
		
		while(true) {
			System.out.print("더하시려는 숫자를 입력하세요(종료는 -1) \n>");
			input = scan.nextInt();
			if(input == -1) {
				break;
								
			}
			
			int[] temp = new int[count];
			for(int i = 0 ;i < count ; i++) {
				temp[i] = numbers[i];
			}
			count++;
			numbers = new int[count];
			for(int i = 0 ;i < count-1 ; i++) {
				numbers[i]= temp[i];
			}
			
			
			numbers[count-1] = input;
			
			
		}
		int sum = 0, avg = 0;
		
		for(int i = 0;i < count ; i++) {
			sum += numbers[i];
			
		}
		avg = sum / count;
		
		
		System.out.print("현재까지의 누적값은 ");
		for(int i = 0 ;i < count; i++) {
			if(i == count-1) {
				System.out.printf("%d = ", numbers[i]);
			}
			else {
				System.out.printf("%d + " , numbers[i]);
			}
		}
		System.out.printf("%d 이고 평균은 %d입니다." ,sum , avg);
		
	}



}
