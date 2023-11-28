public class queueMain {
    public static void main(String[] args) {
        queueImp<Integer> integerqueue = new queueImp<>();
        System.out.println("Is queue empty:- " + integerqueue.isEmpty());
        integerqueue.enqueue(50);
        integerqueue.enqueue(60);
        integerqueue.enqueue(70);

        System.out.println("Size of queue is:- " + integerqueue.size());
        System.out.println("Top element of queue is:- "+integerqueue.front());
        integerqueue.dequeue();
        System.out.println("Top element of queue is:- "+integerqueue.front());
        integerqueue.dequeue();
        System.out.println("Top element of queue is:- "+integerqueue.front());
        integerqueue.dequeue();
        System.out.println("Size of queue is:- " + integerqueue.size());
        System.out.println("Is queue empty:- " + integerqueue.isEmpty());
        System.out.println("Size of queue is:- "+ integerqueue.size());
    }
}
