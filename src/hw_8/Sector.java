package hw_8;

import java.util.Random;

public enum Sector {
    A1("A1", 100),
    A2("A2", 150),
    A3("A3", 120),
    B1("B1", 90),
    B2("B2", 130),
    B3("B3", 110),
    VIP("VIP", 50);

    private final String name;
    private final int seats;

    Sector(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public static Sector getRandomSector(){
        Random random = new Random();
        int randomInt = random.nextInt(7);
        return Sector.values()[randomInt];
    }

    public String getName(){
        return name;
    }
    public int getSeats(){
        return seats;
    }

}
