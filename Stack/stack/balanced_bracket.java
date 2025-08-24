package stack;
import java.util.Scanner;
import java.util.Stack;

public class balanced_bracket {
    public static boolean isvalid(String str){
        Stack<Character> st=new Stack<>();
        int n= str.length();
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);

            }          //(){}[]
            else{

                if(st.size()==0)return false;
                if(st.peek()=='[' && ch==']') {
                    st.pop();
                }
                else if (st.peek()=='(' && ch==')') {
                    st.pop();
                }
                else if(st.peek()=='{'&& ch=='}') {
                    st.pop();
                }else {
                    return false;
                }
            }
        }
        if (st.size()>0)return false;
        return true;
    }
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else {
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='(')st.pop();
            }

        }
        if(st.size()>0) return false;
        else return true;
    }
    public static int isBalanc(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        int count=0;
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else {
                if(st.size()!=0){
                    if(st.peek()=='(') {
                        if (ch==')'){
                            st.pop();
                            count=count+2;
                        }
                    }
                }
            }

        }
        if(st.size()>=0){
            count=count-2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //System.out.println(isvalid(str));
        System.out.println(isBalanc(str));
    }
}
