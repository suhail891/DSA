package stack;

import java.util.Stack;

public class stack_creation {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(6);
        st.push(9);
        st.push(10);
        st.push(20);
        System.out.println(st);
        System.out.println( st.peek());//return only top value of stack
        System.out.println( st.peek());// return only top value of stack
        System.out.println(st);// no change in stack
        System.out.println(st.pop());//remove and return top value of stack
        System.out.println("size of stack is : "+st.size());//return the size of stack
        System.out.println(st.isEmpty());// return boolean value
        // print stack using loop
        while(st.size()>0){
            System.out.print(" "+st.pop());//firstly print top element of stack
        }

    }
}
