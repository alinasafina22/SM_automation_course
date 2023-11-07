package hw_9;

import hw_7.core.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stack {
    private ArrayList<Booking> stack;
    public Stack(){
        stack = new ArrayList<Booking>();
    }

    public void push(Booking booking){
        stack.add(booking);
    }

    public Booking pop(){
        Booking lastItem = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return lastItem;
    }

    public Booking peak(){
        return stack.get(stack.size() - 1);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
