
/*
* Made With Love "❤️" By Rapio
* */

public class LinkedData<T> {
  private static class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }

  }
  private int length = 0;
  private Node<T> head;

  public boolean addToBack(T value) {
    if (head == null) {
      head = new Node<>(value);
      length++;
      return true;
    }
    Node<T> curr = head;

    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = new Node<>(value);
    length++;
    return true;
  }

  public boolean addToFront(T value) {
    Node<T> curr = head;
    head = new Node<>(value);
    head.next = curr;
    length++;
    return true;
  }
  public boolean addWithinIndex(T value, int index) {
    if (index > length || index < 0) {
      return false;
    }
    if (index == 0) {
      return addToFront(value);
    }
    if (index == length) {
      return addToBack(value);
    }

    Node<T> curr = head;
    Node<T> node = new Node<>(value);
    for (int i = 1; i < index; i++) {
      curr = curr.next;
    }
    node.next = curr.next;
    curr.next = node;
    length++;
    return true;
  }

  public T removeFirst() {
    if (head == null) return null;
    Node<T> curr = head;
    head = head.next;
    length--;
    return curr.data;
  }

  public T removeLast() {
    if (head == null) return null;
    if (length == 1) return removeFirst();
    Node<T> curr = head;
    while (curr.next.next != null) {
      curr = curr.next;
    }
    Node<T> deletedNode = curr.next;
    curr.next = null;
    length--;
    return deletedNode.data;
  }

  public int size() {
    return length;
  }

  public T removeWithinIndex(int index) {
    if (index >= length || index < 0) {
      return null;
    }
    if (index == 0) {
      return removeFirst();
    }
    if (index == length - 1) {
      return removeLast();

    }

    Node<T> current = head;
    for (int i = 1; i < index; i++) {
      current = current.next;
    }
    Node<T> next = current.next;
    current.next = current.next.next;
    length--;
    return next.data;
  }



  public boolean removeWithValue(T value) {

    boolean found = false;
    if (head == null) return false;

    Node<T> curr = head;

    while (curr.next != null) {
      if (curr.next.data.equals(value)) {
        curr.next = curr.next.next;
        length--;
        found = true;
        continue;
      }
      curr = curr.next;
    }

    if (head.data.equals(value)) {
      head = head.next;
      length--;
      found = true;
    }

    return found;
  }

  public boolean isEmpty() {
    return head == null;
  }
  public boolean clear() {
    if (head == null) return false;
    head = null;
    length = 0;
    return true;
  }

  public T getLast() {
    if (head == null) return null;
    Node<T> current = head;
    while (current.next != null) {
      current = current.next;
    }
    return current.data;
  }

  public T getFirst() {
    if (head == null) return null;
    return head.data;
  }


  public T get(int index) {
    if (head == null) return null;
    if (index < 0 || index >= length) return null;
    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.data;
  }
  public void reverse() {

    Node<T> previous = null;

    while (head != null) {
      Node<T> next = head.next;
      head.next = previous;
      previous = head;
      head = next;
    }

    head = previous;

  }

  public void print() {
    System.out.print("[");
    Node<T> current = head;
    for (int i = 0; i < length;i++) {
      System.out.print(current.data);
      if (i != length - 1) {
        System.out.print(",");
      }
      current = current.next;
    }
    System.out.println("]");
  }
}
