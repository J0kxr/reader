package reader;

import java.io.*;

public class read{
    public read(){
            
        String htmlString = null;
            
        public String readHTML(String path) throws IOException{
        
        
            BufferedReader reader = new BufferedReader(new FileReader("path"));
        
            while(null != reader.readLine()){
                htmlString += reader.readLine();
            }
        
            reader.close();
            return htmlString;
        }
        public String parseGasStation(String html){
            //liest Tankstelle aus
            return html.substirng
        }
        
        public int GasToID(String GasStation){//setzt die ID fuer die jeweilige Tankstelle
        
        }
        public float parsePrice(String html){
        
        }//liest Preise aus

    
}