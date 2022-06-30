import java.util.ArrayList;

public class CustomStack<T> {

    private ArrayList<T> list;

    private int size = 10;


    public CustomStack() {}

    public CustomStack(int size) { this.size = size; }


    public void push(T element) {

        list = new ArrayList<>(size);

        list.add(element);

    }

    public T pop() {

        T element = list.remove(list.size() - 1);

        return element;

    }

    public T pops(T element) { return element; }

    public T peek() {


        return list.get(list.size() - 1);

    }


}
