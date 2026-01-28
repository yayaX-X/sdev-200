import java.util.GregorianCalendar;

// Class creation and declerations
public class MyDate
{
    int year;
    int month;
    int day;

    // no-arg constructor for current date
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH) + 1; // Months are 0-based
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // constructor with elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // constructor with specific date
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // getters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // method to set date with elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH) + 1; // Months are 0-based
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
