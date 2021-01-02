package reader;

import java.io.*;

public class read{

    private static String html;

        public void readHTML(String path) throws IOException{
            String text = null;
        
            BufferedReader reader = new BufferedReader(new FileReader("path"));
        
            while(null != reader.readLine()){
                text += reader.readLine();
            }
        
            reader.close();
            setHTML(text);
        }

    public read(int ID, String path){
        readHTML(path);
        parseGasStation(html, ID);
        parsePrice(html, ID);
    }

        public String parseGasStationOverID(String html, int ID){
            //liest Tankstelle aus
            return html.substring(4, 6);
        }

        public float parsePrice(String html, int ID){
        
        }//liest Preise aus

        public void setHTML(String hmtl){
            this.html = html;
        }

        public String getHMTL(){
            return this.html;
        }
}