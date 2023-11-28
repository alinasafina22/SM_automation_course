package hw_9;

import hw_7.core.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stack {
    private Booking[] stack;
    private int stackTop = -1;
    public Stack(int length){
        stack = new Booking[length];
    }

    public void push(Booking booking){

        if (stackTop > stack.length){
            System.err.println("Stack overflow");
            return;
        }
        else{
            stack[++stackTop] = booking;
        }
    }

    public Booking pop(){
        if(stackTop<0){
            System.err.println("Stack contains no elements");
            return null;
        }
        return stack[stackTop--];
    }

    public Booking peak(){
        if(stackTop<0){
            System.err.println("Stack contains no elements");
            return null;
        }
        else {
            return stack[stackTop];
        }
    }

    public int size(){
        int len = 0;
        for (Booking i: stack){
            if (i != null){
                len++;
            }
        }
        return len;
    }

    public boolean isEmpty(){
        return stack.length < 0;
    }
}
