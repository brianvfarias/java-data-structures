
// import edu.brian.queue.Node;
import edu.brian.queue.Queue;
// import edu.brian.stackimplement.Node;
// import edu.brian.stackimplement.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> q = new Queue<String>();
        System.out.println(q.toString());
        q.enqueue("Banyuri");
        q.enqueue("Naylon");
        q.enqueue("Nicole");
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
