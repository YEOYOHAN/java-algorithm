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
		result1 = String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.1f만원입니다.\n", money, name, out);
		return result1;
	}
	
	public String getScoreCalc(int in) {
		String result2 = "";
		int count = 0;
		int[] num = null;
		while(true) {
			if(in == -1) {
				break;
			}
			int[] temp = new int[count];
			for(int i = 0 ;i < count ; i++) {
				temp[i] = num[i];
			}
			count++;
			num = new int[count];
			for(int i = 0 ;i < count-1 ; i++) {
				num[i]= temp[i];
			}
			num[count-1] = in;
		}
		int sum = 0, avg = 0;
		for(int i = 0;i < count ; i++) {
			sum += num[i];
		}
		avg = sum / count;
		result2 = String.format("%d 이고 평균은 %d입니다." ,sum , avg);
		return result2;
		}
	
	public String getReportCard(String name, String[] subjects, int scores) {
		String result3 = "";
		while(true) {
			int sum = 0;
			double average = 0;
			String pass = "";
			int[] scores1 = new int[3];
			for(int i=0; i < subjects.length; i++) {
			}
			for(int i=0; i< scores1.length; i++) {
				sum += scores1[i];
			}
			average = Math.floor(sum / (double)scores1.length);
		
			if(average >= 90) {
				pass = "장학생";
			}else if(average >= 70) {
				pass = "합격";
			}else {
				pass = "불합격";
			}
		
			result3 = String.format("학생        국어        영어        수학        총점        평균        합격여부");
			result3 = String.format("=================================================");
			result3 = String.format("%s   %d      %d      %d      %d    %.0f     (%s)\n", name, scores1[0], scores1[1], scores1[2], sum, average, pass);
			return result3;
		}
	}
	public void Ranking() {}
	public void PassOrFail() {}
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
	public void HowMuch() {}
	public void getBmi() {}
	public void getAc() {}

}
