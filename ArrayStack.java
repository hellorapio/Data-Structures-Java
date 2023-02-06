public class ArrayStack<T> {
  private final T[] ARR;
  private int top = -1;
  private final int CAPACITY;

  public ArrayStack(int capacity) {
    this.CAPACITY = capacity;
    ARR = (T[]) new Object[capacity];
  }

  public int size() {
    return top + 1;
  }
  public boolean push(T value) {
    if (isFull()) return false;
    ARR[++top] = value;
    return true;
  }

  public T pop() {
    if (isEmpty()) return null;
    T element = ARR[top];
    ARR[top--] = null;
    return element;
  }

  public T peek() {
    if (isEmpty()) return null;
    return ARR[top];
  }
  public boolean isFull() {
    return top == CAPACITY - 1;
  }

  public boolean isEmpty() {
    return top == -1;
  }
  public void display() {
    for (int i = top; i >= 0; i--) {
      System.out.println(ARR[i]);
    }
  }
}
