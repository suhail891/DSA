package stack;

import java.util.Stack;
import java.util.Scanner;

public class create_stack_using_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st =new Stack<>();
        int n;
        System.out.print("Enter the size of Stack:");
        n=sc.nextInt();
        System.out.print("Enter element of stack is:");
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        //after while loop stack become empty
//        while(st.size()>0){
//            System.out.print(" "+st.pop());
//        }
//        System.out.println();
//        System.out.println(st.isEmpty());


    }
}
