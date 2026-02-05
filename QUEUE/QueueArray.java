public class QueueArray {

    int size ;
    int [] queue;
    int front , rear;

    public QueueArray(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }


    void enqueue(int value){

        if(rear == size - 1){
            System.out.println("Overflow");
            return;
        }
        queue[++rear] = value ;

    }

    int dequeue(){
        if(front > rear){
            System.out.println("Underflow");
            return -1 ;
        }

        return queue[front++];


    }

    int peek(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

      void display() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

     public static void main(String[] args) {

        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();

        System.out.println("Front: " + q.peek());
    }

    
    
}
