package homework04_calender;

public class MyCalendarService {
	public String getEndDay(MyCalendar mc) {
		String endDay = "";
		int days = 0;
		int month  = mc.getMonth();
		while(month > 12) {
		}
		switch(month) {
		case 2: days = 29;break;
		case 4:
		case 6:
		case 9:
		case 11: days = 30; break;
		default: days = 31 ; break;
		}
		endDay =  String.format("%d월은 %d일 까지 입니다." , month, days);
		return endDay;
	}
	public String isLeapYear(MyCalendar mc) {
		String leapYear = "";
		int year = mc.getYear();
		if(year%4==0) {
			leapYear = "윤년";
		if(year%100==0) {
			leapYear = "평년";
		if(year%400==0) {
			leapYear = "윤년";
				}
			}
		}else {
			leapYear = "평년";
			}
		//leapYear = String.format(leapYear);
		return leapYear;
	}
}

