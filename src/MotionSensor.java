

public class MotionSensor extends Sensor{

    private float range;
    private String type;

    public MotionSensor(String loc, String n, boolean status, float reach){
        super(loc, n, status);
        range = reach;
        type = "Motion";
    }

    public String getType(){
        return type;
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }
}
