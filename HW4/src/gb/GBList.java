package gb;

import gb.list.Node;

public interface GBList<T> {
    boolean addFirst(T type);
    boolean addLast(T type);
    int size();
    T get(int index);
}
