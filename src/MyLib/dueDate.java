package MyLib;

public class dueDate {
    private int Month;
    private String Date, Year;

    public dueDate(int Month, String Date, String Year) {
        this.Month = Month;
        this.Date = Date;
        this.Year = Year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }
    
    
}
