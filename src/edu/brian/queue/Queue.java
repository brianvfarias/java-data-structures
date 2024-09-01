package edu.brian.queue;

public class Queue<T> {
  private Node<T> queueEnd;

  public Queue() {
    this.queueEnd = null;
  }

  public boolean isEmpty() {
    if (this.queueEnd == null)
      return true;
    return false;
  }

  public T first() {
    if (this.isEmpty())
      return null;
    Node<T> auxiliaryNode = this.queueEnd;
    while (true) {
      if (auxiliaryNode.getRefNode() != null) {
        auxiliaryNode = auxiliaryNode.getRefNode();
      } else {
        break;
      }
    }
    return auxiliaryNode.getObj();
  }

  public T dequeue() {
    if (this.isEmpty())
      return null;
    Node<T> firstNode = this.queueEnd;
    if (firstNode.getRefNode() == null) {
      this.queueEnd = null;
      return firstNode.getObj();
    }
    Node<T> auxiliaryNode = this.queueEnd;

    while (true) {
      if (firstNode.getRefNode() != null) {
        auxiliaryNode = firstNode;
        firstNode = firstNode.getRefNode();
      } else {
        auxiliaryNode.setRefNode(null);
        break;
      }
    }
    return firstNode.getObj();
  }

  public void enqueue(T object) {
    Node<T> newNode = new Node<T>(object);
    newNode.setRefNode(this.queueEnd);
    this.queueEnd = newNode;
  }

  @Override
  public String toString() {
    String printQueue = "-----------\n";
    printQueue += "QUEUE\n";
    printQueue += "-----------\n";
    Node<T> auxiliaryNode = this.queueEnd;
    if (this.isEmpty()) {
      printQueue += "null";
      return printQueue;
    }
    while (true) {
      printQueue += "[Node {obj=" + auxiliaryNode.getObj() + "} ===>";
      if (auxiliaryNode.getRefNode() != null) {
        auxiliaryNode = auxiliaryNode.getRefNode();
      } else {
        printQueue += "null";
        break;
      }
    }
    return printQueue;
  }

}
