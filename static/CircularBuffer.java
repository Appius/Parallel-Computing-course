/**
 * Created by Yuliia_Valchuk on 8/7/2014.
 */
public interface CircularBuffer<E> {
    public E push(E item);
    public E pop();
}
