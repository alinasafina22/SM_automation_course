package linked_list;

public class LinkedList  {
    Node first;
    Node last;
    int size = 0;

    public void add(String element){
        if (size == 0){
            this.first = new Node(element, null, null);
            this.last = this.first;
        } else {
            Node last = this.last;
            Node newElement = new Node(element, null, last);
            last.next = newElement;
            this.last = newElement;
        }
    }
    public void add(int index, String element){
        Node prev;
        Node last;
         
    }

    public String get(int index){
        return null;
    }

    public void insert(int index, String element){

    }

    public void delete(int index){

    }
}
