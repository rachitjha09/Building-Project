
/**
 * Write a description of class Building here.
 *
 * @author (Rachit)
 * @version (11/28)
 */
public class Building
{

    private int windows;
    private String name;
    
    public void setWindows(int windows){
        this.windows=windows;
    }
    public void setName(String n){
        name=n;
    }
    public int getWindows(){
        return windows;
    }
    public String getName(){
        return name;
    }
    @Override public String toString(){
        return "Name : " + name + " Windows= " + windows;
    }
    public Building(){
        //windows=0;
        //name="Unknown";
        this(0, "Unknown");
    }
    public Building(String name){
        this(0, name);
        
    }
    public Building(int windows, String name){
        this.windows=windows;
        this.name=name;
    }
}