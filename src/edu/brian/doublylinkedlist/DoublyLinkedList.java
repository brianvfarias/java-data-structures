package edu.brian.doublylinkedlist;

public class DoublyLinkedList<T> {
  private Node<T> head;
  private Node<T> tail;
  private int listSize;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.listSize = 0;
  }

  public boolean isEmpty() {
    return this.listSize == 0 ? true : false;
  }

  public int size() {
    return this.listSize;
  }

  private Node<T> getNode(int idx) {
    if (idx == 0)
      return this.head;
    if (idx == (this.listSize - 1))
      return this.tail;

    if (idx >= this.listSize)
      throw new IndexOutOfBoundsException();

    int halfList = this.listSize / 2;
    int count;
    boolean increment;
    Node<T> auxNode = null;
    if (idx <= halfList) {
      auxNode = this.head;
      increment = true;
      count = 0;
    } else {
      auxNode = this.tail;
      increment = false;
      count = this.listSize - 1;
    }

    do {
      if (increment) {
        auxNode = auxNode.getNextNode();
        count++;
      } else {
        auxNode = auxNode.getPrevNode();
        count--;
      }
    } while (idx != count);
    return auxNode;
  }

  public T get(int idx) {
    return this.getNode(idx).getContent();
  }

  public void add(T newContent) {
    Node<T> newNode = new Node<T>(newContent);
    if (this.head == null) {
      this.head = newNode;
      this.tail = newNode;
    }
    if (this.tail != null) {
      newNode.setPrevNode(this.tail);
      this.tail.setNextNode(newNode);
      this.tail = newNode;
    }
    this.listSize++;
  }

  public void add(int idx, T newContent) {
    Node<T> newNode = new Node<T>(newContent);
    if (idx == 0) {
      this.head.setPrevNode(newNode);
      newNode.setNextNode(this.head);
      this.head = newNode;
      this.listSize++;
      return;
    }
    Node<T> auxNode = this.getNode(idx);
    newNode.setNextNode(auxNode);
    newNode.setPrevNode(auxNode.getPrevNode());
    auxNode.getPrevNode().setNextNode(newNode);
    this.listSize++;
  }

  @Override
  public String toString() {
    if (this.head == null)
      return "DoublyLinkedList []";
    String printDLL = "DoublyLinkedList [\n";
    Node<T> auxNode = this.head;
    while (auxNode != null) {
      printDLL += "{content:" + auxNode.getContent() + "}";
      auxNode = auxNode.getNextNode();
    }
    printDLL += "]";
    return printDLL;
  }

}
