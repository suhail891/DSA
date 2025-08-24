package stack;

import java.util.Stack;

public class print_Stack_recursion {
    public static void revstack(Stack<Integer> st){
        if (st.size()==0)return;
        int x=st.pop();
        System.out.print(x+" ");
        revstack(st);
        st.push(x);

    }
    public static void stackrecursion(Stack<Integer> st){
        if(st.size()==0)return;
        int x=st.pop();
        stackrecursion(st);
        System.out.print(x+" ");
        st.push(x);
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
        System.out.println();
        stackrecursion(st);
        System.out.println();
        System.out.println(st);

    }
}
