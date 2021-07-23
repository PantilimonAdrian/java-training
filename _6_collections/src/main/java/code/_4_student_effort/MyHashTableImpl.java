package code._4_student_effort;

public class MyHashTableImpl<K, V> implements MyHashTable<K, V>{

    private final Object[] hashElements = new Object[100_000_000];
    private int size = 0;

    @Override
    public V get(K key) {
        return (V) this.hashElements[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
        this.hashElements[key.hashCode()] = value;
        size++;
    }

    @Override
    public void remove(K key) {
        this.hashElements[key.hashCode()] = null;
        size -=1;
    }

    @Override
    public boolean containsKey(K key) {
        return this.hashElements[key.hashCode()] != null;
    }

    @Override
    public int size() {
        return size;
    }
}
