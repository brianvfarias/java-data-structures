import edu.brian.doublylinkedlist.DoublyLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
        // System.out.println(dll.size());
        // System.out.println(dll);
        // dll.add("Brian");
        // dll.add("Thiago");
        // dll.add("Thierry");
        // dll.add("Camile");
        // System.out.println(dll.size());
        // System.out.println(dll);
        // System.out.println(dll.get(0));
        // dll.add(0, "Banyuri");
        // dll.add("Nicole");
        // dll.add("Caca");
        // dll.add("Algodão");
        // dll.add(7, "Naylon");

        // System.out.println(dll.size());
        // System.out.println(dll.get(7));
        // System.out.println(dll);
        dll.add("Banyuri");
        dll.add("Naylon");
        dll.add("Cat");
        dll.add("Nicole");
        dll.add("Caca");
        dll.add("Algodão");
        System.out.println(dll);
        System.out.println("Takes out " + dll.remove(0));
        System.out.println(dll);
        System.out.println("Takes out " + dll.remove(4));
        System.out.println(dll);
        System.out.println("Takes out " + dll.remove(1));
        System.out.println(dll);
    }
}
