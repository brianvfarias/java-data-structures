package edu.brian.linkedlist;

public class LinkedList<T> {
  private Node<T> startItem;
  private int listSize = 0;

  public LinkedList() {
    this.startItem = null;
  }

  public boolean isEmpty() {
    return this.startItem == null ? true : false;
  }

  public int size() {
    return this.listSize;
  }

  public void add(T content) {
    Node<T> newNode = new Node<T>(content);
    if (this.isEmpty()) {
      this.startItem = newNode;
      this.listSize++;
      return;
    }
    Node<T> auxNode = this.startItem;
    int lastNodeIdx = this.size() - 1;
    for (int i = 0; i < lastNodeIdx; i++) {
      auxNode = auxNode.getRefNode();
    }
    auxNode.setRefNode(newNode);
    this.listSize++;
  }

  private void validateIndex(int idx) {
    if (idx >= this.listSize) {
      throw new IndexOutOfBoundsException(
          "Index " + idx + " is bigger than the current list's size of " + (listSize - 1));
    }
  }

  private Node<T> getNode(int idx) {
    this.validateIndex(idx);
    if (idx == 0)
      return this.startItem;
    Node<T> auxNode = this.startItem;
    int count = 0;

    while (count != idx) {
      auxNode = auxNode.getRefNode();
      count++;
    }

    return auxNode;
  }

  public T get(int idx) {
    return this.getNode(idx).getContent();
  }

  public T remove(int idx) {
    Node<T> removed = this.getNode(idx);
    if (idx == 0) {
      this.startItem = removed.getRefNode();
    } else {
      Node<T> auxNode = this.getNode(idx - 1);
      auxNode.setRefNode(auxNode.getRefNode());
    }
    this.listSize--;
    return removed.getContent();
  }

  @Override
  public String toString() {
    if (this.isEmpty())
      return null;
    String str = "LinkedList [\n";
    Node<T> auxNode = this.startItem;
    for (int i = 0; i < this.listSize; i++) {
      str += "{content: " + auxNode.getContent() + "}\n";
      auxNode = auxNode.getRefNode();
    }
    str += "]";
    return str;
  }

}
