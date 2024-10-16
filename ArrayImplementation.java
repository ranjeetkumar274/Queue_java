import java.util.*;
public class ArrayImplementation {
    public static class queue{
        private int front = -1;
        private int rear = -1;
        private int[] arr = new int[6];
        private int size = 0;
        public  void add(int val){
            if(rear == arr.length-1){
                System.out.println("The Queue is full!");
            }
            else if(front == -1 && rear == -1){
                front++;
                rear++;
                arr[rear] = val;
                size++;
            }
            else{
                rear++;
                arr[rear] = val;
                size++;
            }
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty we cant remove !");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty we cant remove !");
                return -1;
            }
            else{
                return arr[front];
            }

        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
            }
            else{
                for(int i = front; i <= rear; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        queue q = new queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.display();
    }
}
