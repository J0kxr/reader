package reader;

public class ID{
    private long ID;

    public ID(){
        ID = getID();
        
        oneUp(this.ID);
    }

    private void oneUp(long ID){
        ID += 1;
        setID(ID);
    }

    public void setID(long ID){
        this.ID = ID;
    }

    public long getID(){
        return this.ID;
    }
}