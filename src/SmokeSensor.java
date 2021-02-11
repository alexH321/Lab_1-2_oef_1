

public class SmokeSensor extends Sensor{
    private boolean detectSmokeAndHeat; // if true, detecting both heat and smoke, else detecting only smoke

    public SmokeSensor(String kind, String loc, String n, boolean status, boolean detecting){
        super(kind, loc, n, status);
        detectSmokeAndHeat = detecting;
    }

    public boolean getDetectSmokeAndHeat(){
        return detectSmokeAndHeat;
    }

    public void setDetectSmokeAndHeat(boolean detectSmokeAndHeat){
        this.detectSmokeAndHeat = detectSmokeAndHeat;
    }
}
