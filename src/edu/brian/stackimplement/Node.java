package edu.brian.stackimplement;

public class Node {

  private int content;
  private Node reference = null;

  public void setContent(int newContent) {
    this.content = newContent;
  }

  public void setReference(Node newRef) {
    this.reference = newRef;
  }

  public int getContent() {
    return this.content;
  }

  public Node getReference() {
    return this.reference;
  }

  public Node(int content) {
    this.content = content;
  }

}
