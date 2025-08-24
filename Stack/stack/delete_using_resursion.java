package stack;

import java.util.Stack;

public class delete_using_resursion { //indexing start as 0,1,2,3,4....
    public static void delete_from_idx(Stack<Integer> st,int idx){
        if(st.size()-1==idx) {
            st.pop();
            return;
        }
        int x=st.pop();
        delete_from_idx(st,idx);
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
        int idx=3;
        delete_from_idx(st,idx);
        System.out.println(st);
    }
}
