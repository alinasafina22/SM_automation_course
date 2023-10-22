package hm_6;

public class Ufo extends FlyingMachine {
    String galaxyOfProduction;
    public Ufo(String name, int maxSpeed, int maxPassangers, boolean isPassengers, int maxHeight){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxPassangers = maxPassangers;
        this.maxHeight = maxHeight;
        this.isPassengers = isPassengers;
    }

    public void setGalaxy(String galaxyOfProduction){
        this.galaxyOfProduction = galaxyOfProduction;
    }
    
    public String getGalaxy(){
        return galaxyOfProduction;
    }
}
