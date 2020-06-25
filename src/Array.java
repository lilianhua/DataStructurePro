/**
 * 自定义数组
 */
public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getCapacity() {
        return data.length;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
        add(size, e);
//        if (size == data.length) {
//            throw new IllegalArgumentException("AddLast fail.Array is full.");
//        }
//        data[size] = e;
//        size++;
    }

    public void addFirst(int e) {
        add(0, e);
    }

    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add fail.Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add fail.index requires index>=0 && index<=size.");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public int get(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Get fail.index requires index<size.");
        }
        return data[index];
    }

    public void set(int index, int e) {
        if (index >= size) {
            throw new IllegalArgumentException("Get fail.index requires index<size.");
        }
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Size is %d,Capacity is %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }
}
