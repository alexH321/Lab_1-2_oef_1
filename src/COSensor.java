

public class COSensor extends Sensor{

    private float concentration;
    private String type;

    public COSensor(String loc, String n, boolean status, float amount){
        super(loc, n, status);
        concentration = amount;
        type = "CO";
    }

    public String getType(){
        return type;
    }

    public float getConcentration() {
        return concentration;
    }

    public void setConcentration(float concentration) {
        this.concentration = concentration;
    }
}

