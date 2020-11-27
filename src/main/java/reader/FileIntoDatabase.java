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

    public String getStationName(String html){

        String stationName;
        stationName = html.substring(8968, )
    }
    
    

    public String getPrices(String hmtl){ // sets the price attribte of eevery station class
        Station [] stationNumber= new Station();

        float[] price = new price[0, 1, 2, 3];
        price[0] = (float) html.substring(9042, 9047);
        price[1] = (float) html.substring(10188, 10193);
        price[2] = (float) html.substring(11331, 11336);
        price[3] = (float) html.substring(12485, 12490);
    }

    


    

    
  


    public String getAlleDateiNamen(){
        return this.alleDateiNamen;
    }

}