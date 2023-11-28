package hm_6;

public class Main {
    public static void main(String[] args) {
        Shuttle capsule = new Shuttle("Капсула", 2000, 5, true, 15000);
        capsule.status();
        capsule.takeOff(10000);
        capsule.increaseSpeed(1500);
        capsule.addPassengers(5);
        capsule.status();
        Ufo flyingSaucer = new Ufo("Летающая тарелка", 1000000000, 3, false, 100000000);
        flyingSaucer.status();
        flyingSaucer.takeOff(14343);
        flyingSaucer.increaseSpeed(15435);
        flyingSaucer.addPassengers(5);
        flyingSaucer.status();
        flyingSaucer.landing();
        flyingSaucer.status();
        Airplane airbus = new Airplane("Boeing-737", 800, 300, true, 10000);
        airbus.addPassengers(300);
        airbus.takeOff(5700);
        airbus.increaseSpeed(800);
        airbus.status();
        airbus.setCountOfCabinCrewCabinCrew(5);
        System.out.println(airbus.getCountOfCabinCrew());
        airbus.setAirline("Аэрофлот");
        System.out.println(airbus.getAirline());
        flyingSaucer.setGalaxy("Milky Way");
        System.out.println(flyingSaucer.getGalaxy());
    }
}
