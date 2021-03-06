package hashtable;

public class Node {
  private String key;
  private String value;
  private Node next;

  public Node(String key, String value){
    setKey(key);
    setValue(value);
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

  public Node getNext() {
    return next;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
