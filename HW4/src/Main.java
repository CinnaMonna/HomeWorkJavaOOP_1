import gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> linkedList1 = new GBLinkedList<>();
        GBLinkedList<Integer> linkedList2 = new GBLinkedList<>();

        linkedList1.addFirst(1);
        linkedList1.addFirst(2);
        linkedList1.addFirst(3);

        System.out.println("Последовательно добавили элементы 1, 2, 3 в НАЧАЛО списка №1:");
        System.out.println(linkedList1);

        linkedList1.addLast(4);
        linkedList1.addLast(5);
        linkedList1.addLast(6);

        System.out.println("Последовательно добавили элементы 4, 5, 6 в КОНЕЦ списка №1:");
        System.out.println(linkedList1);

        System.out.printf("Длина списка №1: %d\n", linkedList1.size());


        System.out.printf("Элемент с индексом 0:   %d\n", linkedList1.get(0));
        System.out.printf("Элемент с индексом 3:   %d\n", linkedList1.get(3));
        System.out.printf("Элемент с индексом 5:   %d\n", linkedList1.get(5));
        System.out.println("------------------------");

        linkedList2.addLast(1);
        linkedList2.addLast(2);
        linkedList2.addLast(3);

        System.out.println("Последовательно добавили элементы 1, 2, 3 в КОНЕЦ списка №2:");
        System.out.println(linkedList2);

        linkedList2.addFirst(4);
        linkedList2.addFirst(5);

        System.out.println("Последовательно добавили элементы 4, 5 в НАЧАЛО списка №2:");
        System.out.println(linkedList2);

        System.out.printf("Длина списка №2: %d\n", linkedList2.size());
        System.out.println("------------------------");

    }
}