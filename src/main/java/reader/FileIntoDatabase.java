package reader;

import java.io.*;
import java.util.Scanner;

public class FileIntoDatabase{

    private String alleDateiNamen = null;

    /*
    public String dateinamenAusOrdner(String s){
        String dataname;
        dataname = s.substring(#1begin, #2end);
        return dataname;
    }
    */
    //get hole bunch of datanames in a string and substring it to one dataname after another 

    public String DateiAuslesen(String dateiname){
        BufferedReader file = null;
        String fullText = null;
        try{
        file = new BufferedReader(new FileReader(dateiname));
        //readout the file
        String zeile = null;

        while((zeile = file.readLine()) != null){//readLine read out the line
                fullText = fullText + zeile;
            }
        return fullText;

        }catch (IOException e){
            e.printStackTrace();

        }finally{
             try{
                if (file != null){
                    file.close();
                }
            }catch (IOException e){
            e.printStackTrace();
            }
        }

        return "Datei nicht auslesesbar!";
    }
       
    

    
  


    public String getAlleDateiNamen(){
        return this.alleDateiNamen;
    }

}