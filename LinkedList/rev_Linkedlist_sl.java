class sl{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data){
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
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.print("null");
    }
    public static void main(String []args){
        sl s=new sl();
        s.addNode(3);
        s.addNode(2);
        s.addNode(5);
        s.addNode(7);
        s.addNode(8);
        s.reverse();
        s.display();
    }
}
