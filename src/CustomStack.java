import java.util.ArrayList;

public class CustomStack<T> implements MethodStack<T> {

    private ArrayList<T> list;

    private int size = 10;


    public CustomStack() {}

    public CustomStack(int size) { this.size = size; }

    public void init() { list = new ArrayList<>(size); }


    public void push(T element) { list.add(element); }

    public T pop() {

        T element = list.remove(list.size() - 1);

        return element;

    }

    public int getSize() { return list.size(); }


    public T peek() { return list.get(list.size() - 1); }



}
