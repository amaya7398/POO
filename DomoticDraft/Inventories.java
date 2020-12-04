public interface Inventories {
    
    String getNameInventory();
    void setNameInventory(String nameInventory);
    
    int search(Object o);
    void add(Object o);
    boolean remove(Object o);
    Object[] moreInventory(Object[] o);
    Object[] lessInventory(Object[] o, int iItem);
    //Device[] moreInventory(Object[] o);
    String toString();
}
