package stack;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates {
    public static String remove(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            if(st.size()==0 || st.peek()!=current){
                st.push(current);
            } else if (st.peek()==current) {
                st.pop();
            }
        }
        String newstr="";
        while(st.size()>0){
            newstr=st.pop()+newstr;
        }

        return newstr;
    }
    public static void main(String[] args) {
        String str="abbaca";
        String newstring=remove(str);
        System.out.print(newstring);

    }
}
