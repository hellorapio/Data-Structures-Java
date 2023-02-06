public class ArrayQueue<T> {
  private final T[] ARR;
  private int front = -1;
  private int back = -1;
  private final int CAPACITY;

  public ArrayQueue(int capacity) {
    this.CAPACITY = capacity;
    ARR = (T[]) new Object[capacity];
  }

  public boolean enqueue(T value) {
    if (isFull()) return false;
    if (front == -1) front = 0;
    ARR[++back] = value;
    return true;
  }

  public T dequeue() {
    if (isEmpty()) return null;
    T element = ARR[front];
    if (front >= back) {
      front = -1;
      back = -1;
    } else {
      front++;
    }
    return element;
  }

  public T peek() {
    if (isEmpty()) return null;
    return ARR[front];
  }
  public boolean isFull() {
    return front == 0 && (back == CAPACITY - 1);
  }

  public boolean isEmpty() {
    return front == -1;
  }

  public int size() {
    return back + 1;
  }

  public void display() {
    if (front < 0) return;
    for (int i = front; i <= back; i++) {
      System.out.print(ARR[i] + " ");
    }
    System.out.print("\n");
  }
}
