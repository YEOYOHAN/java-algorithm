package homework01;
import java.util.Scanner;
public class GenderChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(Ex 111111-1111111): ");
		String num = "";
		num = scan.next();
		int age = Integer.parseInt(num.substring(7,8));
		switch(age) {
		case 0: num = "1800 ~ 1899년에 태어난 여성"; break;
		case 1: num = "1900 ~ 1999년에 태어난 남성"; break;
		case 2: num = "1900 ~ 1999년에 태어난 여성"; break;
		case 3: num = "2000 ~ 2099년에 태어난 남성"; break;
		case 4: num = "2000 ~ 2099년에 태어난 여성"; break;
		case 5: num = "1900 ~ 1999년에 태어난 외국인 남성"; break;
		case 6: num = "1800 ~ 1899년에 태어난 여성"; break;
		case 7: num = "1800 ~ 1899년에 태어난 여성"; break;
		case 8: num = "2000 ~ 2099년에 태어난 외국인 여성"; break;
		case 9: num = "1800 ~ 1899년에 태어난 남성"; break;
		default : break;
		}
		System.out.println(num);
        }
    }



