package reader;

import org.jsoup.nodes.Node;
import java.io.*;

public class read{

   /*
    public final String html;

        public String readHTML(String path) throws FileNotFoundException, IOException{
            String lines = null;
        
            BufferedReader reader = new BufferedReader(new FileReader("path"));
        
            while(null != reader.readLine()){
                lines += reader.readLine();
            }
        
            reader.close();
            //setHTML(lines);
            return lines;
        }

    public read(int GasID, String path) throws IOException{
        this.html = readHTML(path);//TODO(Torben):Ask someone why it doesnt count if you want to set the private final var
        parseGasStationOverID(GasID);
        parsePrice(GasID);
    }

        public String parseGasStationOverID(int GasID){
            //liest Tankstelle aus
            String GasStation;
            //String text = getHTML();
            String text = html; //for the public var html

            switch(GasID){
                case 00:
                    GasStation = text.substring(9018, 9040);//Ferie
                    return GasStation;
                case 01:
                    GasStation = text.substring(10166, 10186);//OMV 
                    return GasStation;
                case 02:
                    GasStation = text.substring(11307, 11329);//SHell
                    return GasStation;
                case 03:
                    GasStation = text.substring(12458, 12483);//E-Center
                    return GasStation;
                default :
                    GasStation = text.substring(13611, 13638);//Mowak aka Tankpool
                    return GasStation;
            }          
        }


        public float parsePrice(int GasID){
            //ließt Preis aus 
            float price;
            //String text = getHTML();
            String text = html; //for the public var html

            
            switch (GasID){
                case 00:
                    price = Float.parseFloat(text.substring(9042, 9047));
                    return price;
                case 01:
                    price = Float.parseFloat(text.substring(10188, 10193));
                    return price;
                case 02:
                    price = Float.parseFloat(text.substring(11331, 113366));
                    return price;
                case 03:
                    price = Float.parseFloat(text.substring(12485, 12490));
                    return price;
                default:
                    price = Float.parseFloat(text.substring(13640, 13645));
                    return price;
            }
            
        
        }

        /*
        public void setHTML(String hmtl){
            this.html = html;
            //TODO(Torben): look for the static var and why is it useless here!
        }

        public String getHTML(){
            return this.html;
        }
        */
}