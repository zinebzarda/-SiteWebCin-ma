package jee.javapack.dto;

public class DateModel {
    private String day;
    private String numDay;
    private String month;

    public DateModel(String day, String numDay, String month) {
        this.day = day;
        this.numDay = numDay;
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getNumDay() {
        return numDay;
    }

    public void setNumDay(String numDay) {
        this.numDay = numDay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
