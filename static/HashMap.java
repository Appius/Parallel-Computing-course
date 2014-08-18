/**
 * Created by Yuliia_Valchuk on 8/6/2014.
 */
public interface HashMap<K,V> {

    public V put(K key, V value);
    public V replace(K key, V value);
    public V get(K key);
    public V remove(K key);
}
