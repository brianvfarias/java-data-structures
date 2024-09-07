package edu.brian.linkedlist;

public class Node<T> {
  private T content;
  private Node<T> refNode;

  public Node() {
    this.refNode = null;
  }

  public Node(T content) {
    this.refNode = null;
    this.content = content;
  }

  public Node(T content, Node<T> refNode) {
    this.content = content;
    this.refNode = refNode;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public Node<T> getRefNode() {
    return refNode;
  }

  public void setRefNode(Node<T> refNode) {
    this.refNode = refNode;
  }

  @Override
  public String toString() {
    return "Node [content=" + content + ", refNode=" + refNode + "]";
  }

  public String toStringLink() {
    String str = this.toString();
    if (this.refNode != null) {
      str += "-> " + this.refNode.toString();
      return str;
    }
    str += "-> null";
    return str;
  }

}
