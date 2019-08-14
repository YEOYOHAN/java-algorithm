package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		String eval ="";
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			eval += (i == 5) ? i + " = " : i + " + ";
			sum += i;
		}
		System.out.println(eval + sum);
	}
}