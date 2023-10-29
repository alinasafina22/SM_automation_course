package hw_8;

//Билет состоит из следующих полей - ФИО, номер билета, сектор, номер места.
public class Ticket {
    String owner;
    int ticketNumber;
    Sector sector;
    int seatNumber;

    public Ticket(String owner, int ticketNumber, Sector sector, int seatNumber){
        this.owner = owner;
        this.ticketNumber = ticketNumber;
        this.sector = sector;
        this.seatNumber = seatNumber;
    }

    public boolean isTicketValid(){
        return (owner != null)  && (seatNumber > 0 && seatNumber<sector.getSeats());
    }
}
