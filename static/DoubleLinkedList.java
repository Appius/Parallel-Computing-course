/**
 * Created by Yuliia_Valchuk on 8/6/2014.
 */
public interface DoubleLinkedList<E> {

    public void add(int index);
    public void add(int index, E element);
    public E set(int index, E element);
    public E get(int index);
    public E remove(int index);
}
