public class Main {

    public static void main(String[] args) {
        Array data = new Array(20);
        for (int i = 0; i < 10; i++) {
            data.add(i, i + 1);
        }
        System.out.println(data);
        System.out.println("---------------------------");
        data.addFirst(100);
        data.addLast(222);
        System.out.println(data);
    }
}
