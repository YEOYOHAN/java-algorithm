package homework02;
import java.util.Scanner;
public class Ranking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfPlayer = 3;
		Scanner scan = new Scanner(System.in);
		double[] records = new double[numOfPlayer];
		String[] players = new String[] {"A" , "B" ,"C"};
		
		
		System.out.println("기록입력기");
		for(int i = 0 ;i < numOfPlayer; i++) {
			System.out.printf("%s 선수 기록>", players[i]);
			records[i] = scan.nextDouble();
						
		}
		//정렬
		for(int i = 0 ;i < numOfPlayer ; i++) {
			for(int j = 0 ;  j <numOfPlayer -1; j++ ) {
				if(records[j] > records[j+1] ) {
					double tempDB = records[j];
					records[j] = records[j+1];
					records[j+1] = tempDB;
					
					String tempST = players[j];
					players[j] = players[j+1];
					players[j+1] = tempST;
					
				}
			}
		}
		
		
		
		
		
		//출력
		for(int i = 0; i < numOfPlayer; i++) {
			System.out.printf("%d등: %s: 선수기록(%.1f) \n", i+1, players[i], records[i]   );
		}
		

	}



}
