package stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> ext1=new Stack<>();
        while(st.size()>0){
            ext1.push(st.pop());
        }
        Stack<Integer> ext2=new Stack<>();
        while(ext1.size()>0){
            ext2.push(ext1.pop());
        }
        while(ext2.size()>0){
            st.push(ext2.pop());
        }
        System.out.println(st);
    }
}
