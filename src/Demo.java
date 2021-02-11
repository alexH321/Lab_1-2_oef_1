public class Demo {
    public static void main(String[] args){
        SmokeSensor smokeSensor1 = new SmokeSensor("Kitchen", "smokeSensor1", false, true);
        SmokeSensor smokeSensor2 = new SmokeSensor("Garage", "smokeSensor2", false, true);
        MotionSensor motionSensor = new MotionSensor("Front Door", "motionSensor1", false, 25);
        COSensor coSensor = new COSensor("Basement", "coSensor1", false, 20);


        smokeSensor1.alarm("Smoke", true, "smokeSensor1");
        smokeSensor2.alarm("Smoke", false, "smokeSensor2");
        motionSensor.alarm("Motion", true, "motionSensor1");
        coSensor.alarm("CO", true, "coSensor1");
    }
}
