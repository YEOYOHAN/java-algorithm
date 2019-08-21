package homework04_calender;

import javax.swing.JOptionPane;

public class MyCalendarController {

	public static void main(String[] args) {
		
		MyCalendar mc = null;
		MyCalendarService calendarService = new MyCalendarService();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.년과월 입력 2.EndDay 3.LeapYear")) {
			case "0" : System.out.println("종료");
				return;
				
			case "1" :
				mc = new MyCalendar();
				mc.setYear(Integer.parseInt(JOptionPane.showInputDialog("년도 입력")));
				mc.setMonth(Integer.parseInt(JOptionPane.showInputDialog("월 입력")));
				break;
				
			case "2" :
				JOptionPane.showMessageDialog(null, "2.EndDay \n"+calendarService.getEndDay(mc));
				break;
				
			case "3" :
				JOptionPane.showMessageDialog(null, "3.LeapYear \n"+calendarService.isLeapYear(mc));
				break;
			}
		}
	}
}
