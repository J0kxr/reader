package reader;

import java.lang.Object.*;
import java.lang.String.*;

public class Date{

    private int year;
    private int month;
    private int day;
    
    Date d = new Date();
    String dString = d.toString();
    //Mon Jul 28 14:20:20 CEST 2003

    public Date(){
        year = actualYear( dString);
        month = actualMonth(dString);
    }

    public int actualYear(String now){
        String yearString = now.substring(25,29);
        int year = Integer.parseInt(yearString);

        setYear(year);
        return year;
    }


    public int actualMonth(String now ){

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
}
