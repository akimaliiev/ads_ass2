package com.company;

public class Main {

    public static void main(String[] args) {
        MyHeap<Integer> heap = new MyHeap(10);
        heap.add(5);
        heap.add(4);
        heap.add(3);
        heap.add(2);
        heap.add(9);
        heap.print();
        heap.removeRoot();
        heap.print();
        heap.remove(3);
        heap.print();

        //Stack
//        MyStack<Integer> stack = new MyStack<>(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.print();
//        stack.push(6);
//        stack.pop();
//        stack.print();
//        System.out.println(stack.top());
//        System.out.println();


        //Queue
//        MyQueue<Integer> q = new MyQueue<>();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//        q.print();
//        q.dequeue();
//        q.print();
//        System.out.println(q.peek());
    }
}
