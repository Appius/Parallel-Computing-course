/**
 * Created by Yuliia_Valchuk on 8/7/2014.
 */
public interface DoubleEndedQueue<E> {
    public void addFirst(E element);
    public void addLast(E element);
    public E removeFirst();
    public E removeLast();
}
