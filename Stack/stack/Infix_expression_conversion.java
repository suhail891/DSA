package stack;

import java.util.Stack;

public class Infix_expression_conversion {
    static String prefix(String str){
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>+48 && ascii<=58){
                String st=""+ch;
                val.push(st);
            }else{
                if(op.size()==0||ch=='('|| op.peek()=='('){
                    op.push(ch);
                } else if (ch==')') {
                    //do work
                    while(op.peek()!='('){
                        String val2=val.pop();
                        String val1=val.pop();
                        char o=op.pop();
                        val.push(o+val1+val2);
                    }
                    //remove ( from stack
                    op.pop();
                } else if (ch=='+' || ch=='-') {
                    if(op.peek()=='*'|| op.peek()=='/'){
                        String val2=val.pop();
                        String val1=val.pop();
                        char o=op.pop();
                        val.push(o+val1+val2);
                        op.push(ch);
                    }else{
                        String val2=val.pop();
                        String val1=val.pop();
                        char o=op.pop();
                        val.push(o+val1+val2);
                        op.push(ch);
                    }
                } else if (ch=='*' || ch=='/') {
                    if(op.peek()=='*'|| op.peek()=='/'){
                        String val2=val.pop();
                        String val1=val.pop();
                        char o=op.pop();
                        val.push(o+val1+val2);
                        op.push(ch);
                    }else{
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size()>1){
            String val2=val.pop();
            String val1=val.pop();
            char o=op.pop();
            val.push(o+val1+val2);
        }
        return val.pop();
    }
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        System.out.println(prefix(str));

    }
}
