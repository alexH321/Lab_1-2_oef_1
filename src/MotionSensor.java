

public class MotionSensor extends Sensor{

    private float range;

    public MotionSensor(String kind, String loc, String n, boolean status, float reach){
        super(kind, loc, n, status);
        range = reach;
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }
}
