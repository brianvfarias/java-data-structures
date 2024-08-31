import edu.brian.queue.Node;
import edu.brian.queue.Queue;
// import edu.brian.stackimplement.Node;
// import edu.brian.stackimplement.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        System.out.println(q.toString());
        q.enqueue(new Node("Banyuri"));
        q.enqueue(new Node("Naylon"));
        q.enqueue(new Node("Nicole"));
        System.out.println("First is " + q.first());
        System.out.println(q.toString());
        System.out.println("Takes out " + q.dequeue());
        System.out.println(q.toString());
        System.out.println("Takes out " + q.dequeue());
        System.out.println(q.toString());
        System.out.println("Takes out " + q.dequeue());
        System.out.println(q.toString());
        System.out.println("First is " + q.first());
    }
}
