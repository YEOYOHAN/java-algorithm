package homework04_member;

public class Member {
	private String name, id, pw, ssn, blood;
	private double height, weight;
	private int salary;

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		
		return String.format("회원정보: \n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈맥형 : %s \n"
				+ "키 : %.1f \n"
				+ "몸무게 : %.1f \n"
				+ "연봉 : %d \n"
				, name, id, pw, ssn, blood, height, weight, salary);
	}
}
