package edu.brian.queue;

public class Node {
  private Object obj;
  private Node refNode;

  public Node(Object obj) {
    this.refNode = null;
    this.obj = obj;
  }

  public Object getObj() {
    return obj;
  }

  public void setObj(Object obj) {
    this.obj = obj;
  }

  public Node getRefNode() {
    return refNode;
  }

  public void setRefNode(Node refNode) {
    this.refNode = refNode;
  }

  @Override
  public String toString() {
    return "Node [obj=" + obj + "]";
  }

}
