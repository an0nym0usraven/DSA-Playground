package Stacks;

public class StackImp
{
    class Stack
    {
        int size = 200;
        int[] arr = new int[size];
        int top = -1;

        public void push(int val)
        {
            if(top<size)
            {
                top = top + 1;
                arr[top] = val;
            }
            else
            {
                System.out.println("Stack Overflow");
            }
        }

        public int pop()
        {
            int val = 0;
            if(top > -1)
            {
                val = arr[top];
                top = top - 1;
            }
            else
            {
                System.out.println("Stack Underflow");
            }
            return val;
        }

        public int peek()
        {
            if(top == -1)
            {
                int val = arr[top];
                return val;
            }
            
            return 0;
        }

        int size()
        {
            return top+1;
        }
    }
    public static void main(String[] args) {
        
    }
}
