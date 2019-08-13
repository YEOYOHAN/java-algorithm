package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int com = ran.nextInt(3)+1;
        System.out.println("가위, 바위, 보중 하나를 입력하세요: ");
        String me = scan.next();
        switch(com) {
        case 1: System.out.println("가위");
        	switch(me) {
        	case "가위": System.out.println("비겼습니다."); break;
        	case "바위": System.out.println("이겼습니다."); break;
        	case "보": System.out.println("졌습니다."); break;
        	}
        case 2: System.out.println("바위");
        	switch(me) {
        	case "가위": System.out.println("졌습니다."); break;
        	case "바위": System.out.println("비겼습니다."); break;
        	case "보": System.out.println("이겼습니다."); break;
        	}
        case 3: System.out.println("보");
        	switch(me) {
        	case "가위": System.out.println("이겼습니다."); break;
        	case "바위": System.out.println("겼습니다."); break;
        	case "보": System.out.println("비겼습니다."); break;
        	}
        }
	}
}
