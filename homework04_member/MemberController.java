package homework04_member;

import javax.swing.JOptionPane;

public class MemberController {
	
	public static void main(String[] args) {
		Member member = null;
		MemberServic memberServic = new MemberServic();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.Join 2.마이페이지 3.BMI 4.Tax"))	{
			case "0" : System.out.println("종료");
				return;
			
			case "1" :
				member = new Member();
				member.setId(JOptionPane.showInputDialog("ID입력"));
				member.setPw(JOptionPane.showInputDialog("PW입력"));
				member.setName(JOptionPane.showInputDialog("이름입력"));
				member.setSsn(JOptionPane.showInputDialog("주민번호입력"));
				member.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키입력")));
				member.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게입력")));
				member.setBlood(JOptionPane.showInputDialog("혈액형입력"));
				member.setSalary(Integer.parseInt(JOptionPane.showInputDialog("연봉입력")));
				break;
				
			case "2" :
				JOptionPane.showMessageDialog(null, "2.메이페이지 \n"+member.toString());
				break;
				
			case "3" :
				JOptionPane.showMessageDialog(null, "3.BIM \n"+memberServic.getBmi(member));
				break;
				
			case "4" :
				JOptionPane.showMessageDialog(null, "4.Tax \n"+memberServic.getTax(member));
				break;
				}
			}
	}

}
