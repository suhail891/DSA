package stack;

import java.util.Stack;
import java.util.Scanner;
//indexing start with 1,2,3....
public class delete_from_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> ext=new Stack<>();
        System.out.print("Enter index no:");
        int idx=sc.nextInt();
        while(st.size()>idx){
            ext.push(st.pop());
        }
        st.pop();
        while (ext.size()>0){
            st.push(ext.pop());
        }
        System.out.println(st);
    }
}
