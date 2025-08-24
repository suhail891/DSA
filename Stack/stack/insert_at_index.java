package stack;

import java.util.Stack;
import java.util.Scanner;
//indexing start as 0,1,2,3.......
public class insert_at_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> ext =new Stack<>();
        System.out.print("Enter index number:");
        int idx=sc.nextInt();
        while(st.size()>idx){
            ext.push(st.pop());
        }
        System.out.print("Enter the value:");
        int x=sc.nextInt();
        st.push(x);
        while(ext.size()>0){
            st.push(ext.pop());
        }
        System.out.println(st);

    }
}
