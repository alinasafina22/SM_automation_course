package hw_9;

public class Booking extends Application implements IBook {

    @Override
    public String openApplication() {
        return "Open Booking";
    }

    @Override
    public String closeApplication() {
        return "Close Booking";
    }

    @Override
    public String bookProperty() {
        return "Property booked";
    }

    @Override
    public String cancelBooking() {
        return "Booking canceled";
    }
}
