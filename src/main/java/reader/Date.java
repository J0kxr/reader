package reader;

import java.lang.Object.*;
import java.lang.String.*;

public class Date{

    private int year;
    private int month;
    private int day;
    
    public Date(){
        year = actualYear();
        month = actualMonth()
    }

    public int actualYear(){
        Date d = new Date();
        String dString = d.toString();
        //Mon Jul 28 14:20:20 CEST 2003

        dString = dString.substring(25,29);
        int year = Integer.parseInt(dString);

        setYear(year);
        return year;
    }

    
    public int actualMonth(){

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
