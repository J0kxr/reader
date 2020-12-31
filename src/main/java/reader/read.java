package reader;

import java.io.*;

public class read{

    public String readHTML(String path) throws IOException{
        String htmlString = null;

        BufferedReader reader = new BufferedReader(new FileReader("path"));

        while(null != reader.readLine()){
            htmlString += reader.readLine();
        }
    
        reader.close();
        return htmlString;
    }

    public float parsePrice(){}

    public String parseGasStation(){
    }

    public int GasToID(String GasStation){
        
    }
}