package com.company;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> st;
    private int top;
    private int size;

    public MyStack(int size)
    {
        top = -1;
        this.size = size;
        this.st = new ArrayList<T>(size);
    }

    public void push(T X) {
        if (top + 1 == size) {
            System.out.println("Can't add stack is full");
            return;
        }
        top = top + 1;
        if (st.size() > top) st.set(top, X);
        else{
// checking            System.out.println("ads90 " + st.size());
            st.add(X);
        }

    }

    public T top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return st.get(top);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    public boolean empty() {
        return top == -1;
    }

    public void print(){
        for (int i = 0; i <= top; i ++){
            System.out.println(st.get(i));
        }
        System.out.println();
    }

}

