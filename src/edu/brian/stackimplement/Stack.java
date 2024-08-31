package edu.brian.stackimplement;

public class Stack {
  private Node topNode;

  public Node top() {
    return this.topNode;
  }

  public void push(Node newNode) {
    Node prevTop = this.topNode;
    this.topNode = newNode;
    newNode.setReference(prevTop);
  }

  public Node pop() {
    if (this.isEmpty())
      return null;
    Node poppedNode = topNode;
    this.topNode = poppedNode.getReference();
    return poppedNode;
  }

  public boolean isEmpty() {
    return this.topNode == null ? true : false;
  }

  @Override
  public String toString() {
    String stackPrint = "------------\n";
    stackPrint += "   Pilha\n";
    stackPrint += "------------\n";
    Node auxiliaryNode = this.topNode;
    while (true) {
      if (auxiliaryNode != null) {
        stackPrint += "Node {" + auxiliaryNode.getContent() + "}";
        auxiliaryNode = auxiliaryNode.getReference();
      } else {
        break;
      }
    }

    return stackPrint;
  }
}
