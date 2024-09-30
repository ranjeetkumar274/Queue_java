import java.util.*;

public class Basics {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();

        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        System.out.println(que);
        que.poll();
        que.remove();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());

    }
}
