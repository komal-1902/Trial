
public class Date {
	
	private int day, month, year;
	
	public Date() { 
		day = 0;
		month = 0;
		year = 0;
	}
	
	public Date(int day, int year, int month) {
		super();
		this.day = day;
		this.year = year;
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void display() {
		System.out.println("Date: " + day + "-" + month + "-" + year);
	}
	
}
