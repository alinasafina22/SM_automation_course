package linked_list;

public class Node {
    String data;
    Node next;
    Node prev;

    public Node(String data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
