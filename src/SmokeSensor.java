

public class SmokeSensor extends Sensor{
    private boolean detectSmokeAndHeat; // if true, detecting both heat and smoke, else detecting only smoke
    private String type;

    public SmokeSensor(String loc, String n, boolean status, boolean detecting){
        super(loc, n, status);
        detectSmokeAndHeat = detecting;
        type = "Smoke";
    }

    public String getType(){
        return type;
    }

    public boolean getDetectSmokeAndHeat(){
        return detectSmokeAndHeat;
    }

    public void setDetectSmokeAndHeat(boolean detectSmokeAndHeat){
        this.detectSmokeAndHeat = detectSmokeAndHeat;
    }
}
