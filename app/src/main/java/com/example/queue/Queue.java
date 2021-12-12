package com.example.queue;

import android.util.Log;

public class Queue {

    private final String TAG = Queue.class.getSimpleName();
    private int data;
    private int front = 0;
    private int rear = 0;
    private int capacity = 10;
    private int[] queue = new int[capacity];

    void enQueue(int data) {
        if (rear == capacity - 1) {
            Log.d(TAG, "enQueue: queue is full ");
            return;
        }
        queue[rear] = data;
        rear++;
    }

    void deQueue() {
        if(front == rear) {
            Log.d(TAG, "deQueue: queue is empty");
            return;
        }
        int ele =  queue[front];
        Log.d(TAG, "deQueue: removed element is:"+ele);
        front++;
    }

    void display() {
        if(rear == front) {
            Log.d(TAG, "display: queue is empty");
            return;
        }

        Log.d(TAG, "display: Front:"+front + " Rear:"+rear);
        for(int i=front;i<=rear;i++) {
            Log.d(TAG, "display: "+queue[i]);
        }
    }
}
