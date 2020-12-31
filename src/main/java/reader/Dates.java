package reader;

import java.lang.Object.*;
import java.lang.String.*;
import java.util.Date;
import java.util.Date.*;

public class Dates{

    private int year;
    private int month;
    private int day;
    
    Date d = new Date();
    String dateString = d.toString();
    //Mon Jul 28 14:20:20 CEST 2003

    actualYear(dateString);
    actualMonth(dateString);
    actualDay(dateString);

    public Dates(){
        year = getYear();
        month = getMonth();
        day = getDay();
    }


    public void actualYear(String now){
        String yearString = now.substring(26,29);
        int year = Integer.parseInt(yearString);

        setYear(year);
    }

    public void actualMonth(String now){
        String monthString = now.substring(5,7);
        int month = Integer.parseInt(monthString);
        
        setMonth(month);
    }

    public void actualDay(String now){
        String dayString = now.substring(9,10);
        int day = Integer.parseInt(dayString);

        setDay(day);
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return this.month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }
}
