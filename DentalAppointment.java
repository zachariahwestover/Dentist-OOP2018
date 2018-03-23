import java.util.Scanner;
public class DentalAppointment{
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		for(int i=0;i<3;i++){
			String first, last, trash;
			int month, day, year, hours, minutes, length;
			DentalAppointment appt;
			
			System.out.print("Please enter your first name: ");
			first = io.nextLine();
			System.out.print("Please enter your last name: ");
			last = io.nextLine();
			System.out.print("Please enter the month: ");
			month = io.nextInt();
			System.out.print("Please enter the day: ");
			day = io.nextInt();
			System.out.print("Please enter the year: ");
			year = io.nextInt();
			System.out.print("Please enter the hour: ");
			hours = io.nextInt();
			System.out.print("Please enter the minute: ");
			minutes = io.nextInt();
			System.out.print("Please enter the length or enter 0 to default: ");
			length = io.nextInt();
			trash = io.nextLine();
			if (length <= 0)
				appt = new DentalAppointment(first,last,month,day,year,hours,minutes);
			else
				appt = new DentalAppointment(first,last,month,day,year,hours,minutes,length);
			appt.display();
		}
	}
	
	private Person who;
	private Date when;
	private Time startTime,endTime;
	private int length;
	
	DentalAppointment(String first, String last, int month, int day, int year, int hours, int minutes, int length){
		this.who = new Person(first,last,"X");
		this.when = new Date(month,day,year);
		startTime = new Time(hours,minutes);
		endTime = new Time(hours,minutes);
		if (length>=240)
			this.length = 240;
		else if( length<30)
			this.length = 30;
		else
			this.length = length;
		endTime.addTime(length);
	}
	DentalAppointment(String first, String last, int month, int day, int year, int hours, int minutes){
		this.who = new Person(first,last,"X");
		this.when = new Date(month,day,year);
		startTime = new Time(hours,minutes);
		endTime = new Time(hours,minutes);
		this.length = 30;
		endTime.addTime(length);
	}
	public void display(){
		who.displayPerson();
		when.displayDate();
		System.out.println(startTime+"-"+endTime);
	}
}