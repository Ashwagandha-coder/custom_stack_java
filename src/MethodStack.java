public interface MethodStack<T> {

    T pop();

    T peek();

    void push(T element);

    int getSize();


}
