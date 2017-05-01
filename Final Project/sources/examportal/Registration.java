package examportal;
import java.util.Calendar;

public class Registration {
	static int Counter;
	private String regNo;
	
	public Registration(int c, int b) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int reg = ++Counter;
		this.regNo = new String("" + (year % 100) + c + b + (reg < 10 ? "00" : reg < 100 ? "0" : 0) + reg);
	}
	public String getID() {
		return this.regNo;
	}
}