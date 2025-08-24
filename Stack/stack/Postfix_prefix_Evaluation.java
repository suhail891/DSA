package stack;

import java.util.Stack;

public class Postfix_prefix_Evaluation {
    static int postfix_evaluation(String str){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=58){
                st.push(ascii-48);
            }else{
                int val2=st.pop();
                int val1=st.pop();
                if(ch=='+')st.push(val1+val2);
                if(ch=='-')st.push(val1-val2);
                if(ch=='*')st.push(val1*val2);
                if(ch=='/')st.push(val1/val2);
            }
        }
        return st.pop();
    }
    static int prefix_evaluation(String str){
        Stack<Integer> st= new Stack<>();
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch= str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=58){
                st.push(ascii-48);
            }else{
                int val1=st.pop();
                int val2=st.pop();
                if(ch=='+')st.push(val1+val2);
                if(ch=='-')st.push(val1-val2);
                if(ch=='*')st.push(val1*val2);
                if(ch=='/')st.push(val1/val2);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        //String postfix="953+4*6/-";
        String prefix="-9/*+5346";
        //System.out.println(postfix_evaluation(postfix));
        System.out.println(prefix_evaluation(prefix));
    }
}
