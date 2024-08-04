package JavaStacks;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

class CircularQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    private int size = 0;
    public CircularQueue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int x){
        if(isFull()) return false;
        data[end] = x;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove(){
        if(isEmpty()) return -1;
        int removedData = data[front];
        front++;
        front = front % data.length;
        size--;
        return removedData;
    }
}
public class Cque {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        System.out.println(cq.insert(1));
        System.out.println(cq.insert(2));
        System.out.println(cq.insert(3));
        System.out.println(cq.insert(4));
        System.out.println(cq.insert(5));
        System.out.println(cq.insert(6));

        System.out.println(cq.remove());


    }
}
