
class SL{
    
    class Node{
    int data;
    Node next;
   public Node(int data){
         this.data=data;
         this.next=null;
    }
}
public Node head=null;
public Node tail=null;

public void addNode(int data){
    Node newNode = new Node(data);
    if(head == null){
        head=newNode;
        tail=newNode;
    }
    else{
        tail.next=newNode;
        tail=newNode;
    }
}
public void display(){
    Node current = head;
    if(current == null){
        System.out.println("List is Empty");
    }
    
    while(current!= null){
        System.out.print(current.data +" ");
        current=current.next;
    }
    System.out.println();
}
public static void main(String []args){
    SL s=new SL();
    s.addNode(1);
    s.addNode(2);
    s.addNode(3);
    
    System.out.println("The data present in the linkedlist are");
    s.display();
}
}
