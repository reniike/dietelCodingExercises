package tdd;

public class Bike {
    private boolean Switch;
    private int accelerate;
    private int decelerate;
    private int gear;

    public void setSwitchOn(boolean switchOn) {
        this.Switch = switchOn;
    }
    public boolean getSwitchOn () {
        return Switch;
    }
    public void setSwitchOff (boolean switchOff){
        this.Switch = switchOff;
    }
    public boolean getSwitchOff(){
        return Switch;
    }

    public void setAccelerate(int speed) {
        if (speed <= 20) {
            this.accelerate = 1 + speed;
        }
        if (speed >= 21) {
            this.accelerate = 2 +speed;
        }
        if (speed >= 31) {
            this.accelerate = 3 + speed;
        }
        if (speed >= 41) {
            this.accelerate = 4 + speed;
        }
    }
    public int getAccelerate(){
        return accelerate;
    }

    public void setDecelerate(int speed ) {
        if (speed  <= 20) {
            this.decelerate = speed - 1 ;
        }
        if (speed  >= 21) {
            this.decelerate = speed - 2 ;
        }
        if (speed  >= 31) {
            this.decelerate = speed - 3;
        }
        if (speed>= 41) {
            this.decelerate = speed - 4;
        }
    }
    public int getDecelerate(){
        return decelerate;
    }
    public void setGear(int speed ) {
        if(speed <= 20){
            gear = 1;
        }
        if(speed  >= 21 ){
            gear = 2;
        }
        if( speed >= 31){
            gear = 3;
        }
        if(speed >= 41){
            gear = 4;
        }
    }
    public int getGear(){
        return gear;
    }


}
