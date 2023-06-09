package Handson.Method_Reference;

public class HMap {
    Node head;

   static class Node{
       int data;
       Node next;
       
       Node(int data){
        this.data = data;
       }
    }

    public static HMap insert(HMap hmap, int data){
        Node new_node = new Node(data);

        if(hmap.head == null){
            hmap.head = new_node;
        }
        else{
            Node last = hmap.head;

            while(last.next != null){
                last = last.next;
            }

            last.next = new_node;
        }
        return hmap;
    }

    public static HMap deletedByKey(HMap hmap, int key){
        Node curr_node = hmap.head, prev = null;

        //1ST CASE: WHERE HEAD NODE ITSELF IS THE KEY
        if(curr_node != null && curr_node.data == key){
        
            hmap.head = curr_node.next;
            System.out.println("Deleted");
            return hmap;
        }

        //2ND CASE : WHERE KEY WAS PRESENT SOMEHWERE OTHER THAN HEAD.
        while(curr_node != null && curr_node.data !=  key){
        
            prev = curr_node;
            curr_node = curr_node.next;
        
        }

        if(curr_node != null){

            prev.next = curr_node.next;
            System.out.println("Deleted");
       
        }


        //3RD CASE : WHERE KEY IS NOT FOUND.
        if(curr_node == null){
            System.out.println("Not Found");
        }


        return hmap;
    }


    public static HMap deleteAtPosition(HMap hmap, int index){
        Node curNode = hmap.head, prex  = null;

        //CASE1: index is 0 and key is at head.
        

    }    

    public static void printList(HMap hmap){
        Node curr_node =  hmap.head;

        System.out.println("Linked List: ");

        while(curr_node != null){
            System.out.println(curr_node.data);
            curr_node = curr_node.next;
        }
    }
    

    public static void main(String[] args) {
        HMap map = new HMap();

        map.insert(map, 1);
        map.insert(map, 2);
        map.insert(map, 3);
        map.insert(map, 4);
        map.insert(map, 5);
        map.insert(map, 6);
        map.insert(map, 7);
        map.insert(map, 8);
        map.insert(map, 9);
        map.insert(map, 10);
       
        map.printList(map);


        map.deletedByKey(map, 30);

        map.printList(map);
    }
}
