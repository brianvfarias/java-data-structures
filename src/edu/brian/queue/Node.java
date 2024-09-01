package edu.brian.queue;

public class Node<T> {
  private T obj;
  private Node<T> refNode;

  public Node(T obj) {
    this.refNode = null;
    this.obj = obj;
  }

  public T getObj() {
    return obj;
  }

  public void setObj(T obj) {
    this.obj = obj;
  }

  public Node<T> getRefNode() {
    return refNode;
  }

  public void setRefNode(Node<T> refNode) {
    this.refNode = refNode;
  }

  @Override
  public String toString() {
    return "Node [obj=" + obj + "]";
  }

}
