package stack;

import java.util.Stack;

public class revstack_using_recursion {
    public static void push_at_bottom(Stack<Integer> st,int x){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }


    }
    public static void revstack(Stack<Integer> st){
        if (st.size()==0)return;
        int x= st.pop();
        revstack(st);
        push_at_bottom(st,x);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        revstack(st);
        System.out.println(st);
    }
}
