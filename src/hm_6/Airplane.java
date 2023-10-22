package hm_6;

public class Airplane extends FlyingMachine{

    int countOfCabinCrew;
    String airline;
    public Airplane(String name, int maxSpeed, int maxPassangers, boolean isPassengers, int maxHeight){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxPassangers = maxPassangers;
        this.maxHeight = maxHeight;
        this.isPassengers = isPassengers;
    }

    public void setCountOfCabinCrewCabinCrew(int countOfCabinCrew){
        this.countOfCabinCrew = countOfCabinCrew;
    }
    public int getCountOfCabinCrew(){
        return countOfCabinCrew;
    }

    public void setAirline(String airline){
        this.airline = airline;
    }

    public String getAirline(){
        return airline;
    }
}
