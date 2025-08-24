package stack;

import java.util.Stack;

public class Next_greater_element {
    public static int[] nextGreater(int[] ar){
        int n=ar.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1;
        st.push(ar[n-1]);
        for (int i = n-2; i >=0; i--) {
            while(!st.isEmpty() && st.peek()<=ar[i]  ){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }

            st.push(ar[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] ar={ 3,2,1,8,6,3,4};
        int[] res=nextGreater(ar);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
