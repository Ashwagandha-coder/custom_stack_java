import java.util.ArrayList;

public class CustomStack<T> {

    private ArrayList<T> list;

    private int size = 10;


    public CustomStack() {}

    public CustomStack(int size) { this.size = size; }


    public void push(T element) {

        list = new ArrayList<>(size);

        list.trimToSize();
        list.add(element);


    }

    public void pop() {

        list.remove(list.size() - 1);
        list.trimToSize();

    }

    public T pop(T element) { return element; }

    public T peek() {

        list.trimToSize();

        return list.get(list.size() - 1);

    }


}
