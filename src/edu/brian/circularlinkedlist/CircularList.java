package edu.brian.circularlinkedlist;

public class CircularList<T> {
  private Node<T> head;
  private Node<T> tail;
  private int listSize;

  public CircularList() {
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
    if (idx >= this.listSize || this.isEmpty())
      throw new IndexOutOfBoundsException("Expects and index infetior to " + this.listSize);
    if (idx == 0)
      return this.head;
    if (idx == this.listSize - 1)
      return this.tail;
    Node<T> auxNode = this.head;
    for (int i = 0; i < idx; i++) {
      auxNode = auxNode.getNextNode();
    }

    return auxNode;
  }

  public T get(int idx) {
    return this.getNode(idx).getContent();
  }

  public T remove(int idx) {
    if (idx >= this.listSize)
      throw new IndexOutOfBoundsException();
    Node<T> auxNode;
    if (idx == 0) {
      auxNode = this.head;
      this.head = auxNode.getNextNode();
      this.tail.setNextNode(this.head);
      this.listSize--;
      return auxNode.getContent();
    }
    if (idx == this.listSize - 1) {
      auxNode = getNode(idx - 1);
      Node<T> currentTail = auxNode.getNextNode();
      auxNode.setNextNode(this.head);
      this.tail = auxNode;
      this.listSize--;
      return currentTail.getContent();
    }
    auxNode = this.head;
    Node<T> removed;
    for (int i = 0; i <= idx; i++) {
      if (idx - i == 1) {
        removed = auxNode.getNextNode();
        auxNode.setNextNode(removed.getNextNode());
        this.listSize--;
        return removed.getContent();
      }
      auxNode = auxNode.getNextNode();
    }
    return null;
  }

  public void add(T content) {
    Node<T> newNode = new Node<T>(content);
    if (this.listSize == 0) {
      this.head = newNode;
      this.tail = this.head;
      this.head.setNextNode(this.tail);
      this.listSize++;
    } else {
      this.tail.setNextNode(newNode);
      this.tail = newNode;
      newNode.setNextNode(this.head);
      this.listSize++;
    }
  }

  @Override
  public String toString() {
    String printList = "[\n CirulasList: \n";
    Node<T> auxNode = this.head;
    for (int i = 0; i < this.listSize; i++) {
      printList += "    { content: " + auxNode.getContent() + "}\n";
      auxNode = auxNode.getNextNode();
    }
    printList += "]";
    return printList;
  }

}
