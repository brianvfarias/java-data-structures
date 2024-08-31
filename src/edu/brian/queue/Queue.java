package edu.brian.queue;

public class Queue {
  private Node queueEnd;

  public Queue() {
    this.queueEnd = null;
  }

  public boolean isEmpty() {
    if (this.queueEnd == null)
      return true;
    return false;
  }

  public Node first() {
    if (this.isEmpty())
      return null;
    Node auxiliaryNode = this.queueEnd;
    while (true) {
      if (auxiliaryNode.getRefNode() != null) {
        auxiliaryNode = auxiliaryNode.getRefNode();
      } else {
        break;
      }
    }
    return auxiliaryNode;
  }

  public Node dequeue() {
    if (this.isEmpty())
      return null;
    Node firstNode = this.queueEnd;
    if (firstNode.getRefNode() == null) {
      this.queueEnd = null;
      return firstNode;
    }
    Node auxiliaryNode = this.queueEnd;

    while (true) {
      if (firstNode.getRefNode() != null) {
        auxiliaryNode = firstNode;
        firstNode = firstNode.getRefNode();
      } else {
        auxiliaryNode.setRefNode(null);
        break;
      }
    }
    return firstNode;
  }

  public void enqueue(Node newNode) {
    Node prevLast = this.queueEnd;
    this.queueEnd = newNode;
    this.queueEnd.setRefNode(prevLast);
  }

  @Override
  public String toString() {
    String printQueue = "-----------\n";
    printQueue += "QUEUE\n";
    printQueue += "-----------\n";
    Node auxiliaryNode = this.queueEnd;
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
