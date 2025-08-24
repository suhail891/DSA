package stack;

import java.util.Stack;

public class copy_stack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt =new Stack<>();
        while (st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(st.isEmpty());
        Stack<Integer> cp= new Stack<>();
        while(gt.size()>0){
            cp.push(gt.pop());
        }
        System.out.println(gt.empty());
        System.out.println(st.isEmpty());
        System.out.println(cp);
    }
}
