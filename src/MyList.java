import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> extends ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = DEFAULT_CAPACITY;
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
        size = capacity;
    }

    public void add(int index, E element) {

        for (int i =index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[index] = element;
        size=elements.length;
    }

    public int size() {
        return size;
    }

    public void ensureCapacity(int minCapactiy) {
        elements = Arrays.copyOf(elements, minCapactiy);
    }

    public boolean add(E element) {
            ensureCapacity(elements.length + 1);
        elements[size] = element;
        size=elements.length;
        return true;
    }

    public E remove(int index) {
        if (index >= 0 || index < size - 1) {
            E element = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size=elements.length;
            ensureCapacity(size);
            return element;
        }
        return null;
    }
    public MyList<E> clone() {
        MyList<E> newElements = new MyList<E>(size());
        for (int i = 0; i < size; i++) {
            newElements.add(i, (E) elements[i]);
        }
        return newElements;
    }
    public int index(E element) {
        for (int i=0;i<size;i++) {
            if (elements[i]==element) {
                return i;
            }
        }
        return -1;
    }
    public  boolean contain(E element) {
        boolean hasElenment=false;
        for (int i=0;i<size;i++) {
            if (elements[i]==element) {
                hasElenment=true;
                break;
            }
        }
        return hasElenment;
    }
    public  void clear() {
        elements=new Object[elements.length];
    }
    public void print()
    {int i=0;
        for(Object element:elements)
        {i++;
            System.out.println(element+"   "+i);
        };
    }
}


