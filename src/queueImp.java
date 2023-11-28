public class queueImp<T> implements queue<T> {
    Node<T> top;

    public queueImp(){
        this.top = null;
    }

    @Override
    public boolean isEmpty(){
        return top==null;
    }

    @Override
    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if(top==null){
            top = newNode;
        }
        else{
            Node<T> temp = top;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;

            }
    }

    @Override
    public int size(){
        int cnt = 0;
        Node<T> temp = top;
        while(temp!=null){
            cnt+=1;
            temp=temp.next;
        }
        return cnt;
    }

    @Override
    public T front(){
        if(top!=null){
            return top.data;
        }
        return null;
    }
    
    @Override
    public void dequeue(){
        if(size()==0){
            System.out.println("No element in queue");

        }
        else{
            if(top.next==null){
                top=null;
            }
            else{
                top = top.next;
            }
        }
    }

}
