package reader;

import java.io.*;

public class read{

    private static String html;

        public void readHTML(String path) throws FileNotFoundException, IOException{
            String lines = null;
        
            BufferedReader reader = new BufferedReader(new FileReader("path"));
        
            while(null != reader.readLine()){
                lines += reader.readLine();
            }
        
            reader.close();
            setHTML(lines);
        }

    public read(int ID, String path) throws IOException{
        readHTML(path);
        parseGasStationOverID(ID);
        parsePrice(ID);
    }

        public String parseGasStationOverID(int ID){
            //liest Tankstelle aus
            int i = ID;
            String GasStation;
            String text = getHTML();

            switch(i){
                case 00:
                    GasStation = text.substring(9018, 9040);//Ferie
                    break;
                case 01:
                    GasStation = text.substring(10166, 10186);//OMV 
                    break;
                case 02:
                    GasStation = text.substring(11307, 11329);//SHell
                    break;
                case 03:
                    GasStation = text.substring(12458, 12483);//E-Center
                    break;
                default :
                    GasStation = text.substring(13611, 13638);//Mowak aka Tankpool
                    break;

            }


            return html.substring(4, 6);
        }

        public float parsePrice(int ID){
            //ließt Preis aus 
            
        
        }


        public void setHTML(String hmtl){
            this.html = html;
        }

        public String getHTML(){
            return this.html;
        }
}