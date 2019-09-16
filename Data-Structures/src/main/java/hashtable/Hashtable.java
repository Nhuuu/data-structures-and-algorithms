package hashtable;

public class Hashtable {

  private Node[] map;

  public Hashtable(int size){
    map = new Node[size];
  }

  private int hash(String key){
    int hashValue = 0;
    char[] letters = key.toCharArray();
    for(int i = 0; i < letters.length; i++){
      hashValue += letters[i];
    }
    hashValue = (hashValue * 599) % map.length;
    return hashValue;
  }

   public void add(String key, String value){
      int hashKey = hash(key);
      if(this.map[hashKey] == null){
        map[hashKey] = new Node(key, value);
      } else {
        Node temp = map[hashKey];
        map[hashKey] = new Node(key, value);
        map[hashKey].setNext(temp);
      }
   }

  public String get(String key){
    int hashKey = hash(key);
    if(this.map[hashKey] != null){
      return map[hashKey].getValue();
    }
    return null;
  }

  public boolean contains(String key){
      int hashKey = hash(key);
      return map[hashKey] != null;
   }

}
