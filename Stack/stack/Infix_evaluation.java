package stack;

import java.util.Stack;

public class Infix_evaluation {
    public static void evaluation(String str){
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                if(op.size()==0 || ch=='(' || op.peek()=='('){
                    op.push(ch);
                }
                else if (ch==')') {
                    while(op.peek()!='('){
                        int val2= val.pop();
                        int val1=val.pop();
                        if(op.peek()=='+')val.push(val1+val2);
                        if(op.peek()=='-')val.push(val1-val2);
                        if(op.peek()=='*')val.push(val1*val2);
                        if(op.peek()=='/')val.push(val1/val2);
                        op.pop(); // remove operator after perform operation
                    }
                    op.pop(); // to remove (
                }
                else if(ch=='+'||ch=='-'){
                    //km priority wala aa gya to work krna pdaga
                    if(op.peek()=='*'||op.peek()=='/'){
                        int val2= val.pop();
                        int val1=val.pop();
                        if(op.peek()=='*')val.push(val1*val2);
                        if(op.peek()=='/')val.push(val1/val2);
                        op.pop();
                        op.push(ch);
                    }
                    // same priority ka  aa gya
                    else if (op.peek()=='+'||op.peek()=='-') {
                        int val2= val.pop();
                        int val1=val.pop();
                        if(op.peek()=='+')val.push(val1+val2);
                        if(op.peek()=='-')val.push(val1-val2);
                        op.pop();
                        op.push(ch);
                    }
                }
                else if (ch=='/'||ch=='*') {
                    //same priority ka hai
                    if(op.peek()=='*'||op.peek()=='/'){
                        int val2= val.pop();
                        int val1=val.pop();
                        if(op.peek()=='*')val.push(val1*val2);
                        if(op.peek()=='/')val.push(val1/val2);
                        op.pop();
                        op.push(ch);
                    }else {
                        op.push(ch);
                    }
                }

            }
        }
        while(val.size()>1){
            int val2= val.pop();
            int val1=val.pop();
            if(op.peek()=='+')val.push(val1+val2);
            if(op.peek()=='-')val.push(val1-val2);
            if(op.peek()=='*')val.push(val1*val2);
            if(op.peek()=='/')val.push(val1/val2);
            op.pop();
        }
        System.out.println(val.peek());
    }
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        evaluation(str);
    }
}
