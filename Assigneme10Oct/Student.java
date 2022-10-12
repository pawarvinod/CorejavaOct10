package JavaTraining10Oct;

public class Student {

	private int sid;
	private String sname;
	private String  smail;
	private int smono;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, String sname, String smail, int smono) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smail = smail;
		this.smono = smono;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	public int getSmono() {
		return smono;
	}
	public void setSmono(int smono) {
		this.smono = smono;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smail=" + smail + ", smono=" + smono + "]";
	}
   
	
}
