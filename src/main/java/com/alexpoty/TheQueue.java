package com.alexpoty;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    TheQueue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
        } else {
            System.out.println("The queue is full");
        }
    }

    public void priorityInsert(String input) {
        int i;
        if (numberOfItems == 0) {
            insert(input);
        } else {
            for (i = numberOfItems - 1; i >= 0; i--) {
                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i+1] = queueArray[i];
                } else break;;
            }
            queueArray[i+1] = input;
            rear++;
            numberOfItems++;
        }
    }

    public void remove() {
        if (numberOfItems > 0) {
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        }
    }

    public String peek() {
        return queueArray[front];
    }
}
