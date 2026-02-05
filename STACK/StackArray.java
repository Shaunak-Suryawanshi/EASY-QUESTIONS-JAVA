public class StackArray {
    
    int size ;
    int [] stack ;
    int top ;

    StackArray(int size){
        this.size = size;
        stack = new int [size];
        top = -1;
    }

    void push(int value){
        if(top == size - 1){
            System.out.println("overflow");
            return ;
        }
        stack[++top] = value;
    }

    int pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return -1;
        }

        return stack[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

      void display() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

       public static void main(String[] args) {

        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped: " + s.pop());

        s.display();

        System.out.println("Top: " + s.peek());
    }
}
