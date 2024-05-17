class singlyLinkedList{
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
    
    public void addAtBeg(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void addAtPos(int data,int pos){
        Node newNode = new Node(data);
        if(pos < 1){
            System.out.println("Invalid position");
        }
        else if(pos == 1){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node current=head;
            for(int i=1; i< pos - 1 && current!=null;i++){
                current=current.next;
            }
            if(current == null){
                System.out.println("Position out of range");
            }
            else{
                newNode.next=current.next;
                current.next=newNode;
            }
        }
    }
    public  void addAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
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
            System.out.println("List is empty");
            
        }else{
        while(current != null){
            System.out.print(current.data + " ==> ");
            current=current.next;
        }
        System.out.print("null");
    }
}
public static void main(String []args){
    singlyLinkedList s=new singlyLinkedList();
    s.addAtBeg(1);
    s.addAtBeg(2);
    s.addAtPos(3,2);
    s.addAtEnd(0);
    s.addAtEnd(7);
    s.display();
}
}

