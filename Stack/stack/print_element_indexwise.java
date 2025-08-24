package stack;

import java.util.Stack;

public class print_element_indexwise {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //using extra stack
        Stack<Integer> ext=new Stack<>();
        while(st.size()>0){
            ext.push(st.pop());
        }
        int i=0;
        while(ext.size()>0){
            int x=ext.pop();
            System.out.println("index "+i+" of :"+x);
            st.push(x);
            i++;
        }
        System.out.println(st);
    }
}
