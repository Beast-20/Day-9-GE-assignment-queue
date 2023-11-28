public interface queue<T> {
    
    boolean isEmpty();
    void enqueue(T data);
    
    int size();
    T front();
    void dequeue();
}
