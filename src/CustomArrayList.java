import java.util.Arrays;

public class CustomArrayList<D> {

  private int size;
  private static final int DEFAULT_CAPACITY = 2;
  private Object elements[];

  public CustomArrayList() {
    elements = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }

  public D get(int i) {
    if (i < 0 || i >= size) {
      throw new IndexOutOfBoundsException("Index: " + i + " - Size: " + size);
    }
    return (D) elements[i];
  }

  public void add(D item) {
    ensureCapacity();
    elements[size++] = item;

  }

  public int size() {
    return size;
  }

  private void ensureCapacity() {
    if (size == elements.length) {
      int newCapacity = elements.length * 2;
      elements = Arrays.copyOf(elements, newCapacity);

    }
  }

}