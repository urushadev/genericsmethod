public class GMultipleDataType< T, V> {
    T value;
    V value1;

    public GMultipleDataType(T value, V value1) {
        this.value=value;
        this.value1= value1;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public V getValue1() {
        return value1;
    }

    public void setValue1(V value1) {
        this.value1 = value1;
    }
}
