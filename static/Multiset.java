/**
 * Created by Yuliia_Valchuk on 8/6/2014.
 */
public interface Multiset<E> {
    /**
     *
     * @param element
     * @param occurrences
     * @return
     */
    public int add(E element, int occurrences);
    public E remove(E element, int occurrences);
    public int count(E element);

    /**
    *Adds or removes the necessary occurrences of an element such that
    * the element attains the desired count.
    */
    int setCount(E element, int count);
}
