package stack;

public interface Stack<E> {

    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
    int getSize();
}
