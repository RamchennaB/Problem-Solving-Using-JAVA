class sl{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     Node head=null;
     Node tail=null;
     public void addNode(int data){
         Node newNode =new Node(data);
         if(head==null){
             head=newNode;
             tail=newNode;
         }
         else{
             tail.next=newNode;
             tail=newNode;
         }
     }
     public void addAtPos(int pos,int data){
         Node newNode=new Node(data);
         if(pos < 1){
             System.out.print("Invalid Position");
         }
         if(pos == 1){
           newNode.next=head;
           head=newNode;
           return;
          }
         Node current=head;
         for(int i=1;i< pos - 1 && current != null;i++){
             current=current.next;
         }
         if(current == null){
             System.out.println("position out of range");
             
         }
         else{
             newNode.next=current.next;
             current.next=newNode;
             
         }
     }
     public void display(){
         Node current =head;
         if(head == null){
             System.out.println("List is empty");
         }
         while(current!= null){
             System.out.print(current.data +" ");
             current=current.next;
         }
     }
     public static void main(String []args){
         sl s=new sl();
         s.addNode(1);
         s.addAtPos(2,2);
         s.addAtPos(3,4);
         s.addAtPos(1,7);
         s.display();
     }
}


