public class Triple<T, E, K> {
    T First;
    E Second;
    K Third;

    public Triple(T First, E Second, K Third) {
        this.First = First;
        this.Second = Second;
        this.Third = Third;
    }

    public T getFirst() {
        return First;
    }

    public E getSecond() {
        return Second;
    }

    public K getThird() {
        return Third;
    }
}
