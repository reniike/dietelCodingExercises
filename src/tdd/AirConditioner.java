package tdd;

public class AirConditioner {
    private boolean Switch;
    private int temperature;
    private int increaseTemperature;
    private int decreaseTemperature;

    public void setSwitchOn(boolean On) {
        this.Switch = On;
    }
    public boolean getSwitchOn(){
       return Switch;
    }
    public void setSwitchOff(boolean off){
        this.Switch = off;
    }
    public boolean getSwitchOff(){
        return Switch;
    }
    public void setTemperature(int aTemperature){
            this.temperature = aTemperature;
            if(aTemperature > 30){
                this.temperature = 30;
            }
            if(aTemperature < 16){
                this.temperature = 16;
            }
        }
    public int getTemperature(){
        return temperature;
    }

    public void setIncreaseTemperature(int aIncreaseTemperature){
        if(increaseTemperature >= 30);
        this.increaseTemperature = aIncreaseTemperature - 1;
    }
    public int getIncreaseTemperature (){
        return increaseTemperature;
    }
    public void setDecreaseTemperature (int aDecreaseTemperature) {
        if(decreaseTemperature <= 16);
        this.decreaseTemperature = aDecreaseTemperature + 1;
    }
    public int getDecreaseTemperature (){
        return decreaseTemperature;
    }

}
