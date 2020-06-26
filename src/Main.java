public class Main {

    public static void main(String[] args) {
        Array data = new Array();
        for (int i = 0; i < 10; i++) {
            data.add(i, i + 1);
        }
        System.out.println("new");
        System.out.println(data);

        data.addLast(100);
        data.addLast(102);
        System.out.println("add");
        System.out.println(data);

        data.removeFirst();
        data.removeFirst();
        data.removeFirst();
        System.out.println("remove");
        System.out.println(data);
    }
}
