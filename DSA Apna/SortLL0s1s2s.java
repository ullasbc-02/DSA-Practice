class LinkedList
{
    Node head;  // head of list
  
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    void sortList()
    {
       int arr[] = new int[3];
       Node n1=head;
       while(n1!=null){
        arr[n1.data]++;
        n1=n1.next;
       }
       n1=head;
       int count = 0;
       while(n1!=null){
        if(arr[count]!=0){
            n1.data=count;
            arr[count]--;
            n1=n1.next;
        }else{
            count++;
        }
        
       }

    }                       
 
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
  
        /* 3. Make next of new Node as head */
        new_node.next = head;
  
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
         
        /* Constructed Linked List is 1->2->3->4->5->6->7->
           8->8->9->null */
        llist.push(0);
        llist.push(1);
        llist.push(0);
        llist.push(2);
        llist.push(1);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(2);
         
        System.out.println("Linked List before sorting");
        llist.printList();
         
        llist.sortList();
 
        System.out.println("Linked List after sorting");
        llist.printList();
    }
} 