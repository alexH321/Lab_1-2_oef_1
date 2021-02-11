

public class COSensor extends Sensor{

    private float concentration;

    public COSensor(String kind, String loc, String n, boolean status, float amount){
        super(kind, loc, n, status);
        concentration = amount;
    }

    public float getConcentration() {
        return concentration;
    }

    public void setConcentration(float concentration) {
        this.concentration = concentration;
    }
}

