package device;

import java.util.Date;

public class Device {

    private State state;
    private final double turnedOnConsumption;
    private final double turnedOffConsumption;
    private final double idleConsumption;
    private final String unit;
    private int warranty; // stands for time left till the device will break
    private int criticalPriority;
    private Date createdAt;

    public Device(State state, int turnedOnConsumption, int turnedOffConsumption, int idleConsumption, String unit, int warranty, int criticalPriority) {
      this.state = state;
      this.turnedOnConsumption = turnedOnConsumption;
      this.turnedOffConsumption = turnedOffConsumption;
      this.idleConsumption = idleConsumption;
      this.unit = unit;
      this.warranty = warranty;
      this.criticalPriority = criticalPriority;
      this.createdAt = new Date();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public double getTurnedOnConsumption() {
        return turnedOnConsumption;
    }

    public double getTurnedOffConsumption() {
        return turnedOffConsumption;
    }

    public double getIdleConsumption() {
        return idleConsumption;
    }

    public String getUnit() {
        return unit;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getCriticalPriority() {
        return criticalPriority;
    }

    public void setCriticalPriority(int criticalPriority) {
        this.criticalPriority = criticalPriority;
    }
}