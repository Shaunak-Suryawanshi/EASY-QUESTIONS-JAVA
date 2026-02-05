class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class lengthLL {

    static int getLength(Node head){

        int count = 0;
        Node temp = head;

        while(temp != null){
            count ++;
            temp = temp.next;
        }

        return count;
    }


     public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Length = " + getLength(head));
    }


    
}
