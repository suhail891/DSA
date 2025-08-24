package stack;

import java.util.Stack;

public class CelebrityProblem {
    public static  int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        Stack<Integer> st=new Stack<>();
        if(mat.length==1){
            return 0;
        }
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int val1=st.pop();
            int val2=st.pop();
            if(mat[val1][val2]==0)st.push(val1);//val2 not a celebrity
            else if(mat[val2][val1]==0)st.push(val2);
        }
        if(st.size()==0){
            return -1;
        }
        int a=st.pop();
        //check ya kisi ko janta hai ya nahi
        for(int j=0;j<n;j++){
            if(a==j)continue;
            if(mat[a][j]==1){
                return -1;
            }
        }
        for(int i=0;i<n;i++){
            if(a==i)continue;
            if(mat[i][a]==0){
                return -1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
       int[][] mat = {{1,1},{1,1}};
        System.out.println(celebrity( mat));

    }
}
