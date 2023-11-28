package hw_9;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(15);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        Booking booking = new Booking();
        Booking booking1 = new Booking();
        stack.push(booking);
        stack.push(booking1);
        System.out.println(stack.peak());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
