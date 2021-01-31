import java.util.List;

public class ListNode<E extends Comparable<E>> {
    E value;
    E head;
    ListNode<E> next;

    public ListNode (E value) {
        this.value = value;

}

    public ListNode() {

    }
}
