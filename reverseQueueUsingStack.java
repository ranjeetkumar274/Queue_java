import java.util.*;
public class reverseQueueUsingStack {

    static Queue<Integer> reverse(Queue<Integer> que, Stack<Integer> st){
        System.out.println(que);
        while(!que.isEmpty()){
            st.add(que.poll());
        }

        while(!st.isEmpty()){
            que.add(st.pop());
        }
        return que;
    }
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < 10; i++){
            que.add(i+1);
        }

        System.out.println(reverse(que,st));
    }
}
