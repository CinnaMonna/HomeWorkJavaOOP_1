package gb.list;

import gb.GBList;
import java.util.Iterator;
import java.lang.StringBuilder;

public class GBLinkedList<T> implements GBList<T> {
    private Node<T> headNode;
    private Node<T> tailNode;
    private int size = 0;

    @Override
    public boolean addFirst(T value) {
        try {
            /**
             * запишем во временную переменную temp новый узел со значением value,
             * которое хотим добавить в список
             */
            Node<T> temp = new Node(value);

            /**
             *  создаем ссылку: в поле нового узла nextNode запишем узел,
             *  который прежде был первым - узел headNode:
             */
            temp.nextNode = headNode;

            /**
             * добавленный узел назначим первым узлом
             */
            headNode = temp;

            /**
             * если до этого момента список был пуст,
             * то есть последнего узла не существует (tailNode == null),
             * то добавленный узел будет являться и первым, и последним
             */
            if (tailNode == null) {
                tailNode = temp;
            }
            size++;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addLast(T value) {
        try {
            /**
             * если до этого момента список был пуст,
             * то есть последнего узла не существует (tailNode == null),
             * то добавляемый узел будет являться и первым, и последним,
             * то есть можем воспользоваться методом addFirst
             */
            if (tailNode == null) {
                addFirst(value);
            } else {
                /**
                 * Иначе: создаем новый узел со значением value;
                 * исправим ссылку: в поле nextNode узла, который прежде
                 * был последним, запишем новый узел;
                 * и новый узел назначим последним
                 */
                Node<T> temp = new Node<>(value);
                tailNode.nextNode = temp;
                tailNode = temp;
                size++;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Реализация метода получения значения по индексу:
     * 1. Проверка на допустимое значение индекса;
     * 2. Текущим узлом назначим первый в списке (headNode);
     * Бежим по индексам от 0 до заданного значения;
     * текущим узлом в каждой новой итерации становится следующий узел
     * через вызов поля nextNode текущего узла.
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        else {
            Node<T> currentNode = headNode;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.nextNode;
            }
            return currentNode.value;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> temp = headNode;
        while (temp != null) {
            sb.append(temp.value).append(" ");
            temp = temp.nextNode;
        }
        return sb.toString();
    }
}

