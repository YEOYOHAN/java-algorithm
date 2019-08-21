package homework04_grade;

public class GradeService {
	public String getReportCard(Grade grade) {
		String result = "";
		String pass ="";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int scores = kor + eng + math;
		int scores1 = scores / 3;
		if(scores1 >= 90) {
			pass = "장학생";
		}else if(scores1 >=70 && scores1 <90) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		result = String.format("   국어    영어    수학    총점    평균    합격여부 \n   %d   %d   %d   %d   %d   %s ",
				kor, eng, math, scores, scores1, pass);
		return result;
	}
}