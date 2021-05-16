public class Queue {
    private int len = 10;
    private int a[] = new int[len];
    private int front,rear;

    Queue(){
        front = -1;
        rear = -1;
    }

    public Boolean isFull(){
        if (front == 0 && rear == len-1){
            return true;
        }
        return false;
    }

    public Boolean isEmpty(){
        return front==-1 ;
    }

    public void enQueue(int x){
        if (isFull()){
            System.out.println("Queue is full.");
        }
        else{
            if (front==-1)
                front =0;
            rear++;
            a[rear]= x;    
            System.out.println(x+" inserted");
        }
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("Empty Queue");
            return 0;
        }
        else{
            int x = a[front];
            if (front>=rear){
                front =-1;
                rear =-1;
            }
            else{
                front++;
            }
            return x;
        }
    }


    public void displayQueue(){
        System.out.println("The elements in queue are : ");
        for(int i=front;i<=rear;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        
        Queue q = new Queue();        
        q.enQueue(56);
        q.enQueue(72);
        q.enQueue(25);
        q.displayQueue();
        q.deQueue();
        q.displayQueue();

    }

}
