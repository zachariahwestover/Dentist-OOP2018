public class Date {
    public int month;
    public int day;
    public int year;

    public Date() {
        month = 1;
        day = 1;
        year = 2000;
    }

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

        date1.displayDate();
        date2.displayDate();
    }

}