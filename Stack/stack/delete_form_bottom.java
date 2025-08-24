package stack;

import java.util.Stack;

public class delete_form_bottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> ext=new Stack<>();
        while(st.size()>0){
            ext.push(st.pop());
        }
        ext.pop();
        while(ext.size()>0){
            st.push(ext.pop());
        }
        System.out.println(st);
    }
}
