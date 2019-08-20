package homework03;

public class Student {
	public String getTimeCalc(int time) {
    	String result = "";
		int hour = time / 3600;
		int min = time / 60;
		int sec = time % 60;
		result = String.format("%d시 %d분 %d초", hour, min, sec);
        return result;
    }
	
	public String getTax(String name, int money) {
		String result1 = "";
		double tax = 9.7;
		double out = money * tax /100;
		result1 = String.format(" %s님께서 납부할 세금은 %.1f만원입니다.\n", name, out);
		return result1;
	}
	
	public String getScoreCalc(int[] numbers) {
		int sum = 0;
		String result2 ="";
		for(int i = 0 ; i< numbers.length; i++) {
			sum += numbers[i] ;
		}
		int avg = sum / numbers.length;
		for(int i = 0 ; i < numbers.length; i++) {
			if(i == numbers.length-1) {
				 result2 += numbers[i] + "=";
			}else {
				result2 += numbers[i] + "+";
			}
		}
		result2 += String.format("%d이고 평균은 %d입니다.", sum , avg);
		return result2;
		}
	
	public String getReportCard(String name , int[] scores) {
		String result3 ="";
		String pass = "";
		for(int i = 0; i< 3; i++) {
			scores[3] += scores[i];
		}
		scores[4] = scores[3] / 3;
		if(scores[4] >= 90) {
			pass = "장학생";
		}else if( scores[4] >= 70 && scores[4] <90) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		result3 = String.format("이름    국어    영어    수학    총점    평균    합격여부\n%s   %d   %d   %d   %d   %d   %s " , 
				name,scores[0], scores[1],scores[2],scores[3],scores[4], pass);
				
		return result3;
	}
	public String Ranking(double[] records) {
		String result4 ="";
		for(int i = 0; i < records.length; i++) {
			for(int j = 0 ; j < records.length -1; j++) {
				if(records[j] > records[j+1]) {
					double tempd = records[j];
					records[j] = records[j+1];
					records[j+1] = tempd;
				}
			}
		}
		for(int i = 0 ;i < 3; i++) {
			 result4 += String.format("%d등 기록 : %.1f \n" , i+1, records[i] );
		}
		return result4;
	}
	public String PassOrFail(String name, int[] scores) {
		String result5 = "";
		for(int i = 0 ; i < 3; i++) {
			scores[3] += scores[i];
		}
		String pass = "";
		scores[4] = scores[3]/ 3;
		if(scores[4] >= 90) {
			pass = "장학생";
		}else if(scores[4] >= 70 && scores[4] <90) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		result5 = String.format("성명    국어    영어    수학    총점    평균    합격여부\n ========================================================\n%s   %d   %d   %d   %d   %d   %s ",
				name, scores[0],scores[1],scores[2],scores[3],scores[4], pass);
		return result5;
	}
	public String getMonthEndDay(int year) {
		String result7 = "";
		int days = 0;
		switch(year) {
		case 2: days = 29;break;
		case 4:
		case 6:
		case 9:
		case 11: days = 30; break;
		default: days = 31 ; break;
		}
		result7 = String.format("%d월은 %d일 까지 입니다." , year, days);
		return result7;
	}
	public String getLeapYear(int year) {
			String result8 = "";
			int year4 = 0, year100 = 0, year400 = 0;
			String yearEn = "";
			year4 = year % 4;
			year100 = year % 100;
			year400 = year % 400;
			if(year4 != 0) {
				yearEn = "평년";
			}else if(year100 == 0 && year400 == 0) {
				yearEn = "윤년";
			}else if(year100 == 0) {
				yearEn = "윤년";
			}else if(year100 != 0) {
				yearEn = "윤년";
			}else {
				System.out.println("잘못된 입력입니다.");
			}result8 = String.format("%s은 %s 입니다.\n", year, yearEn);
			return result8;
	}
	public String Join(String id, String pw, String name, String birth, String blood, double height, double weight) {
		String result9 = "";
		boolean isAdult = true;
		double weightIs = Math.round((weight*100)/100.0);
		result9 = String.format("아이디:%s \n비밀번호: %s \n이름: %s \n생년월일: %s \n성인여부: %s \n키: %.1f \n몸무게: %.1f \n혈액형: %s",
				id, pw, name, birth, ((isAdult)? "성인" : "미성년"), height, weightIs, blood );
		return result9;
	}
	public String HowMuch(int price , int num) {
		String result10 ="";
		int pay = price * num;
		int fPay = pay - (pay/10);
		result10 = String.format("총 %d원입니다. 할인되어서 %d입니다.", pay , fPay);
		return result10;
	}
	public String getBmi(String name, double height, double weight) {
		String result11 = "";
		double bmi = weight / (height * height);
		String bmi2 = "";
		
		if(bmi > 30.0) {
			bmi2 = "고도비만";
		}else if(bmi > 25.0) {
			bmi2 = "비만";
		}else if(bmi > 23.0) {
			bmi2 = "과체중";
		}else if(bmi > 18.5) {
			bmi2 = "정상";
		}else {
			bmi2 = "저체중";
		}
		result11 = String.format("%s님의 BMI는 %s 입니다.", name, bmi2);
		return result11;
	}
	public String getAc(String op , int n1, int n2) {
		String result12 = "";
		int numResult = 0;
		int rest = 0;
		switch(op) {
		case "+":
			numResult = n1 + n2;
			break;
		case "-": numResult = n1 - n2;break;
		case "*": numResult = n1 * n2; break;
		case "/":numResult = n1 / n2; rest = numResult = n1%n2; break;
		}
		if(op.equals("/")) {
			result12 = String.format("%d %s %d = %d[%d]", n1,op ,n2, numResult, rest);
		}else {
			result12 = String.format("%d %s %d = %d", n1,op ,n2, numResult);
		}
		return result12;
	}

}
