package reader;

import java.util.Date;


public class Dates{

    private int year;
    private String month;//TODO(Torben):try to work woth enums on montch and days
    private int day;
    private String dow;
    private String time;
    
    Date d = new Date();
    String dateString = d.toString();
    //String dateString = "Sat Jan 02 23:50:46 CET 2021";
    //Sat Jan 02 23:50:46 CET 2021
    
    public Dates(){
        year = actualYear(dateString);
        month = actualMonth(dateString);
        day = actualDay(dateString);
        dow = actualDow(dateString);
        time = actualTime(dateString);
    }

    public int actualYear(String now){
        String yearString = now.substring(24,28);
        int year = Integer.parseInt(yearString);

        setYear(year);
        return year;
    }

    public String actualMonth(String now){
        String month= now.substring(4,8);
           
        setMonth(month);
        return month;
    }

    public int actualDay(String now){
        
        String dayString = now.substring(8,11);
        float day = Float.parseFloat(dayString);
        //int day = Integer.parseInt(dayString);
        int d = (int)day;//TODO(torben):look up if it has to be that way :/ String->Float->Int because of wrong format of 12 or 03
        setDay(d);
        return d;
    }

    public String actualDow(String now){
        String dow = now.substring(0,3);

        setDow(dow);
        return dow;
    }

    public String actualTime(String now){
        String time = now.substring(11,19);
        setTime(time);
        return time;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public String getMonth(){
        return this.month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public void setDow(String dow){
        this.dow = dow;
    }

    public String getDow(){
        return this.dow;
    }

    public void setTime(String time){
        this.time = time; 
    }
    
    public String getTime(){
        return this.time;
    }
}