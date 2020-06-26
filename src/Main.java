public class Main {

    public static void main(String[] args) {
        Array data = new Array(20);
        for (int i = 0; i < 10; i++) {
            data.add(i, i + 1);
        }
        System.out.println(data);

        System.out.println("------------add---------------");
        data.addFirst(100);
        data.addLast(222);
        System.out.println(data);

        System.out.println("---------get------------------");
        System.out.println(data.get(0));

        System.out.println("-----------set----------------");
        data.set(3,434);
        System.out.println(data);

        System.out.println("----------removeFirst-----------------");
        data.removeFirst();
        System.out.println(data);

        System.out.println("----------removeLast-----------------");
        data.removeLast();
        System.out.println(data);

        System.out.println("----------remove-----------------");
        data.remove(3);
        System.out.println(data);

        System.out.println("----------find-----------------");
        int index = data.find(5);
        System.out.println(index);

        System.out.println("----------contains-----------------");
        boolean isHave = data.contains(5);
        System.out.println(isHave);
    }
}
