public class LinkedQueue<T> {

  private static class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  private int length = 0;
  private Node<T> head;
  private Node<T> tail;

  public T peek() {
    if (head == null) return null;
    return head.data;
  }
  public boolean enqueue(T value) {
    if (head == null) {
      head = new Node<>(value);
      tail = head;
      length++;
      return true;
    }
    tail.next = new Node<>(value);
    tail = tail.next;
    length++;
    return true;
  }
  public T dequeue() {
    if (head == null) return null;
    T current = head.data;
    head = head.next;
    length--;
    return current;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int size() {
    return length;
  }
  public void display() {
    Node<T> current = head;
    for (int i = 0; i < size(); i++) {
      System.out.print(current.data + " ");
      if (current.next != null) {
        current = current.next;
      }

    }
    System.out.print("\n");
  }
}
