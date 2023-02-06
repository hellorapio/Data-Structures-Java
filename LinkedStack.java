public class LinkedStack<T> {

  private static class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node<T> head;
  private int length = -1;

  public boolean push(T value) {
    Node<T> current = head;
    head = new Node<>(value);
    head.next = current;
    length++;
    return true;
  }

  public boolean isEmpty() {
    return head == null ;
  }

  public int size() { return length + 1; }
  public T peek() {
    if (isEmpty()) return null;
    return head.data;
  }

  public T pop() {
    if (isEmpty()) return null;
    Node<T> current = head;
    head = head.next;
    length--;
    return current.data;
  }

  public void display() {
    Node<T> current = head;
    for (int i = 0; i < size();i++) {
      System.out.print(current.data + " ");
      if (current.next != null) current = current.next;
    }
    System.out.print("\n");
  }
}
