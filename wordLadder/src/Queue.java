import java.util.LinkedList;

public class Queue < E extends Comparable<E>> {
    private ListNode<E> head = new ListNode<E> ();
    private ListNode<E> tail;
    private int size;

    public Queue() {this.size = 0; tail = head;}

    public int getSize() {return this.size;}

    public boolean isEmpty() {return this.size == 0;}

    public void enqueue(E value){
        ListNode<E> node = new ListNode<E>(value);
        ListNode<E> current = head.next;
        ListNode<E> previous = head;

        while (current != null && current.value.compareTo(value) < 0){
            previous = current;
            current = current.next;
        }
        previous.next = node;
        node.next = current;
        if (current == null){
            tail = node;
        }
        this.size++;
    }

    public void dequeue(E value) {
        ListNode<E> node = head.next;
        ListNode<E> previous = head;

        while(node.next != null && node.value.compareTo(value) != 0){
            previous= node;
            node = node.next;
        }
        this.size--;
    }
}

