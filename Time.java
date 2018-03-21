public class Time{
	public static void main(String[] args){
		Time[] clock = new Time[4];
		clock[0] = new Time(2,30);
		clock[1] = new Time(25,73);
		clock[2] = new Time(0,0);
		clock[3] = new Time(23,50);
		for (int i=0;i<4;i++){
			System.out.println(clock[i]);
		}
		clock[0].addTime(15);
		clock[1].addTime(1234);
		clock[2].addTime(135);
		clock[3].addTime(25);
		for (int i=0;i<4;i++){
			System.out.println(clock[i]);
		}
	}
	private int hours;
	private int minutes;
	Time(int hours){
		if (hours > 23)
			this.hours = 23;
		else
			this.hours = hours;
		this.minutes = 0;
	}
	Time(int hours, int minutes){
		if (hours > 23)
			this.hours = 23;
		else
			this.hours = hours;
		if (minutes > 59)
			this.minutes = 59;
		else
			this.minutes = minutes;
	}
	public String toString(){
		return (String.format("%d:%02d",hours,minutes));
	}
	public void addTime(int mins){
		this.minutes += mins;
		if (minutes > 59){
			int count = 0;
			while (minutes > 59){
				minutes -= 60;
				count++;
			}
			hours += count;
			while (hours > 23){
				hours -= 24;
			}
		}
	}
}
