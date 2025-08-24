package stack;

import java.util.Stack;

public class Stock_span {
    public static int[] stockspan(int[] ar){
        int [] res=new int[ar.length];
        Stack<Integer> st= new Stack<>();
        res[0]=1;
        st.push(0);
        for (int i=1;i<ar.length;i++){
            while(st.size()>0 && ar[st.peek()]<ar[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=1;
            }else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] ar={100,80,60,70,60,75,85};
        int[] span=stockspan(ar);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}