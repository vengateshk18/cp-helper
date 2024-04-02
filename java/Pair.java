import java.util.Objects;

public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }

    // Additional functionalities can be added as needed

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<String, Integer> pair2 = new Pair<>("Two", 2);

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);

        System.out.println("Pair 1 hashcode: " + pair1.hashCode());
        System.out.println("Pair 2 hashcode: " + pair2.hashCode());

        System.out.println("Pair 1 equals Pair 2: " + pair1.equals(pair2));
    }
}
