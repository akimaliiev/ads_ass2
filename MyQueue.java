package com.company;

import java.util.ArrayList;

public class MyQueue <T>{
    int front = -1, rear = -1;
    ArrayList<T> q = new ArrayList<>();
    T front()
    {
        if (front == -1) return null;
        return q.get(front);
    }

    public T peek(){
        return q.get(front);
    }
    public void enqueue(T X) {
        if (this.empty()) {
            front = 0;
            rear = 0;
            q.add(X);
        }
        else {
            front++;
            if (q.size() > front) {
                q.set(front, X);
            }
            else q.add(X);
        }
    }

    public void dequeue() {
        if (this.empty()) {
            System.out.println("Queue is already empty");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        }
        else {
            rear++;
        }
    }

    public boolean empty() {
        return front == -1 && rear == -1;
    }

    public void print(){
        for (int i = rear; i <= front; i ++){
            System.out.print(q.get(i) + " ");
        }
        System.out.println();
    }

}

