public class ArrayCircularQueue {
    public static class Cqueue{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];
        int n = arr.length;

        public void add(int x) throws Exception{
            if(size == n){
                throw new Exception("Queue is Full!");
            }
            else if(size == 0){
                front = rear = 0;
                arr[rear] = x;
            }
            else if(rear == n-1){
                rear = 0;
                arr[rear] = x;
            }
            else if(rear < n-1){
                arr[++rear] = x;
            }
            size++;
        }

        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }
            else{
                int val = arr[front];
                return val;
            }
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("The queue is Empty!");
            }
            else{
                if(front == n-1){
                    int x = arr[front];
                    front = 0;
                    size--;
                    return x;
                }
                else{
                    int x = arr[front];
                    front++;
                    size--;
                    return x;
                }

            }
        }

        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }

        public void display() throws Exception{
            if(size == 0 ){
                throw new Exception("The queue is Empty!");
            }
            else if(front <= rear){
                for(int i = front;i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else if(rear < front){
                for(int i = front;i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                for(int j = 0; j < rear; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Cqueue q = new Cqueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        q.display();
        q.remove();
        q.display();
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
