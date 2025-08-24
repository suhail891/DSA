package stack;

public class implemntation_stack_using_array {
    public static class stack{
        private int[] ar=new int[5];
        private int idx=0;
        void push(int x){
            if(idx==ar.length){
                System.out.println("Stack is full");
                return;
            }
            ar[idx]=x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is Empty");
                return -1;
            }
            int x=ar[idx-1];
            idx--;
            return x;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is Empty");
                return -1;
            }
            int x=ar[idx-1];
            return x;
        }
        boolean isEmpty(){
            if(idx==0)return true;
            return false;
        }
        int size(){
            return idx;
        }
        boolean isFull(){
            if(idx==ar.length)return true;
            return false;
        }

        void display(){
            for (int i = 0; i < idx; i++) {
                System.out.print(ar[i]+" ");
            }
        }

    }

    public static void main(String[] args) {
        stack st= new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //st.push(10);
        st.display();
        st.pop();
        System.out.println();
        System.out.println(st.peek());
        System.out.println(st.size());


    }
}
