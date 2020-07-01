package stack;

import list.LinkList;

public class LinklistStack<E> implements Stack<E> {

    private LinkList<E> list;

    public LinklistStack() {
        list = new LinkList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: [");
        res.append(list);
        res.append("]");
        return res.toString();
    }
}
