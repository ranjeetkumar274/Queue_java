import java.util.*;
public class reverseQueueUsingStack {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < 10; i++){
            que.add(i+1);
        }

        System.out.println(que);
        while(!que.isEmpty()){
            st.add(que.poll());
        }

        while(!st.isEmpty()){
            que.add(st.pop());
        }

        System.out.println(que);
    }
}
