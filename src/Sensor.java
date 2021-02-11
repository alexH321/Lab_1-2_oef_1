

public class Sensor {
    private String type;
    private String location;
    private String name;
    private boolean active;

    public Sensor(String kind, String loc, String n, boolean status){
        type = kind;
        location = loc;
        name = n;
        active = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public void alarm(){
        if(active == false){

        }
        else{
            System.out.println("Alarm in " + type + location);
        }
    }
}
