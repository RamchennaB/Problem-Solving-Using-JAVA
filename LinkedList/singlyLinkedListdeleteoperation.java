import java.util.Scanner;

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
    
  
    public  void add(int data){
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
    public void deleteAtBeg(){
       if(head==null){
          System.out.println("Cannot perform delete operation");
       }
      else{
           head=head.next;
       }
   }
    public void deleteAtPos(int pos){
        Node current=head;
       if(pos<1){
                System.out.println("Cannot perform delete operation");
       }
       else if(pos==1){
           head=head.next;
       }
       else{
           for(int i=1;i<pos-1&&current !=null;i++){
               current=current.next;
          }
          if(current==null){
              System.out.println("position out of range");
          }
          else{
              current.next=current.next.next;
          }
        
      }
 }
  public void deleteAtEnd(){
      Node current=head;
      if(head == null){
          System.out.println("Cannot perform delete operation");
      }
      if(head.next ==null){
         head=null;
      }
      else{
         while(current.next.next!=null){
             current=current.next;
         }
         current.next=null;
     }
 }
public static void main(String []args){
    singlyLinkedList s=new singlyLinkedList();
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(4);
    s.add(5);
     s.deleteAtBeg();
     s.deleteAtEnd();
    s.deleteAtPos(2);

    s.display();
}
}
