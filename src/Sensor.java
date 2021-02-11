import java.util.ArrayList;

public class Sensor {
    private String location;
    private String name;
    private boolean active;
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();

    public Sensor(String loc, String n, boolean status){
        location = loc;
        name = n;
        active = status;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void alarm(String type, boolean active, String name){
        if (type == "Smoke"){
            if(active == true ){
                System.out.println(name + " is going off in the " + location);
                System.out.println("Closing windows");
                System.out.println();
            }
            else{
                System.out.println(name + " is not active");
                System.out.println();
            }
        }
        if(type == "Motion"){
            System.out.println(name + " is going off in the " + location);
            System.out.println("The police has been contacted");
            System.out.println();
        }
        if(type == "CO"){
            System.out.println(name + " is going off in the " + location);
            System.out.println("Opening windows");
            System.out.println();
        }
    }

    public void testSensor(Sensor s){

    }

    //TODO: adding new sensors
    /*
    public void addSensor(String loc, String n, boolean status){
        Sensor sensor = new Sensor();

    }

    public void checkSensors(){
        if ()
    }*/
}
