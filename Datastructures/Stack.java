/*The stack operations are given below:
Stack(size): creates a new stack that is empty.
push(item) : adds a new item to the top of the stack. 
pop() : removes the top item from the stack.
isEmpty() : tests to see whether the stack is empty.
isFull() : tests to see whether the stack is full.
displayStack() : returns the length of the stack.*/


public class Stack{
    private int a[];
    private int top;
    private int length;

    Stack(int x){
        a = new int[x];
        top = -1;
        length = x;
    }

    public void push(int x){
        if (isFull()){
            System.out.println("Stack is Full \n");
            System.exit(1);
        }
        a[++top] = x;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Empty stack \n");
            System.exit(1);
        }
        return a[top--];
    }

    public int size(){
        return top+1;
    }

    public Boolean isEmpty(){
        return top == -1;
    }

    public Boolean isFull(){
        return top == length-1;
    }

    public void displayStack(){
        System.out.println("The elements of Stack are : ");
        for (int i =0;i<=top;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){
        Stack s = new Stack(110);

        s.push(45);
        s.push(345);
        s.displayStack();
        System.out.println("The size of the stack is : "+s.size());

        System.out.println("The popped out element is" +s.pop());
    }
}
