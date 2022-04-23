package com.company;

import java.util.*;

public class MyHeap<T> {
    private int[] Heap;
    private int size;
    private int maxsize;
    private ArrayList<Integer> heap;

    {
        heap = new ArrayList<>();
    }

    private static final int FRONT  = 1;


    public MyHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;

        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
        heap.add(Integer.MAX_VALUE);
    }

    private int right(int i){
        return i * 2 + 1;
    }

    private int left(int i){
        return i * 2;
    }

    private int parent(int i){
        return i / 2;
    }

    private boolean isLeaf(int i) {
        return i > (size / 2) && i <= size;
    }

    private void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }

    public void add(T item){
        if (size >= maxsize){
            return;
        }
        size++;
        heap.add((Integer) item);
        int curr = size;
        while(heap.get(curr) > heap.get(parent(curr)) && curr > 0){
            Collections.swap(heap, curr, parent(curr));
            curr = parent(curr);
        }
    }

    public void removeRoot(){
        heap.set(1, heap.get(size));
        heap.remove(size);
        size--;
        heapify();
    }

    public void heapify(){
        heapifyUp(1);
        heapifyDown(1);
    }

    public void heapifyUp(int pos){
        int curr = pos;
        while(heap.get(curr) > heap.get(parent(curr)) && curr > 0){
            Collections.swap(heap, curr, parent(curr));
            curr = parent(curr);
        }
    }
    public void heapifyDown(int pos){
        if (!isLeaf(pos)){
            if (left(pos) <= size && heap.get(left(pos)) > heap.get(pos)){
                Collections.swap(heap, pos, left(pos));
                heapifyDown(left(pos));
            }
            if (right(pos) <= size && heap.get(right(pos)) > heap.get(pos)){
                Collections.swap(heap, pos, right(pos));
                heapifyDown(right(pos));
            }

        }
    }


    public boolean remove(int item){
        int index = size;
        boolean found = false;
        for (int i = 1; i <= size; i ++){
            if (heap.get(i) == item){
                index = i;
                found = true;
                break;
            }
        }
        heap.set(index, heap.get(size));
        heap.remove(size);
        size--;
        heapifyUp(index);
        heapifyUp(index);
        return found;
    }


    public void print(){
        for (int i = 1; i <= size; i ++){
            System.out.print(heap.get(i) + " ");
        }
        System.out.println();
    }


}