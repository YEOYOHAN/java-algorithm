package homework04_grade;

import javax.swing.JOptionPane;

public class GradeController {
	public static void main(String[] args) {
	
		Grade grade = null;
		GradeService gradeService = new GradeService();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.점수입력 2.Grade")) {
			
			case "0" :
				System.out.println("종료");
				return;
				
			case "1" :
				grade = new Grade();
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어입력")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수")));
				break;
				
			case "2" :
				JOptionPane.showMessageDialog(null, "2.Grade \n"+gradeService.getReportCard(grade));
				break;
			}
		}
}
}
