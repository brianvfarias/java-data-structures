package edu.brian.doublylinkedlist;

public class Node<T> {
  private T content;
  private Node<T> prevNode;
  private Node<T> nextNode;

  Node(T newContent) {
    this.content = newContent;
    this.prevNode = null;
    this.nextNode = null;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public Node<T> getPrevNode() {
    return prevNode;
  }

  public void setPrevNode(Node<T> prevNode) {
    this.prevNode = prevNode;
  }

  public Node<T> getNextNode() {
    return nextNode;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return "Node [content=" + content + "]";
  }

}
