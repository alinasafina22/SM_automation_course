package hw_9;

public class AirBnb extends Application implements IBook {
    @Override
    public String openApplication() {
        return "Open AirBnb";
    }

    @Override
    public String closeApplication() {
        return "Close AirBnb";
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
