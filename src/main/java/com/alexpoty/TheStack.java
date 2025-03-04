package com.alexpoty;

import java.util.Arrays;

public class TheStack {

    private String[] stack;
    private int stackSize;
    private int topOfStack = -1;

    TheStack(int size) {
        this.stackSize = size;
        stack = new String[size];
        Arrays.fill(stack, "-1");
    }

    public void push(String item) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stack[topOfStack] = item;
        } else System.out.println("Sorry Stack is full");
    }

    public String pop() {
        if (topOfStack >= 0) {
            stack[topOfStack] = "-1";
            return stack[topOfStack--];
        } else {
            System.out.println("Stack is empty");
            return "-1";
        }
    }

    String peek() {
        return stack[topOfStack];
    }
}
