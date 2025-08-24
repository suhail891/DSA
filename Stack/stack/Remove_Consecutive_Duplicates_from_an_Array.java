package stack;

import java.util.Stack;

public class Remove_Consecutive_Duplicates_from_an_Array {
    public static int[] remove(int[] arr){
        Stack<Integer> st= new Stack<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if (i==n-1 || arr[i+1]!=arr[i]){
                    st.push(arr[i]);
                }
            }
        }
        int s=st.size();
        int[] result=new int[s];
        for (int i = s-1; i >=0 ; i--) {
            result[i]=st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,3,4,4,4,4};
        int[] rst=remove(arr);
        for (int i = 0; i < rst.length; i++) {
            System.out.print(rst[i]+" ");
        }
    }
}
