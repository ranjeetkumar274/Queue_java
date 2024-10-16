public class LLImplementation {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static class LLqueue{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if(size == 0){
                System.out.println("The queue is empty!");
                return -1;
            }
            else{
                return head.val;
            }
        }

        public int remove(){
            if(size == 0){
                System.out.println("The queue is empty!");
                return -1;
            }
            else{
                int x = head.val;
                head = head.next;
                size--;
                return x;

            }
        }

        public void display(){
            if(size == 0){
                System.out.println("The queue is empty!");
            }
            else{
                Node temp = head;
                while(temp != null){
                    System.out.print(temp.val+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }

    }
    public static void main(String[] args){
        LLqueue q = new LLqueue();
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
        System.out.println(q.size);
        System.out.println( q.peek());
    }
}
