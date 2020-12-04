public class InventoryRooms implements Inventories{
    private String nameInventory;
    private Room[] rooms;

    public InventoryRooms(String nameInventory){
        this.nameInventory = nameInventory;
        int nRooms = 2;
        rooms = new Room[nRooms];
        createInventory();
    }


    public String getNameInventory(){return nameInventory;}
    public Room getRoom(int nRoom){return rooms[nRoom];}

    public void setNameInventory(String nameInventory){this.nameInventory = nameInventory;}
    
    public int search(Object o){
        int index = -1;
        Room room = (Room) o;
        for (int i=0; i < rooms.length; i++){
            if (rooms[i].equals(room)){ index = i; break;
            }
        }
        return index;
    }

    public void add(Object o){
        Room room = (Room) o;
        rooms = (Room[]) moreInventory(rooms);
        rooms[rooms.length-1] = room;
    }
    public Object[] moreInventory(Object[] o){
        Room[] oRooms = (Room[]) o;
        Room[] incMemory = new Room[rooms.length+1];
        for(int i = 0; i < rooms.length; i++){
            incMemory[i] = oRooms[i]; //"Arrays.copyOf"
        }
        return incMemory;
    }
    
    public boolean remove(Object o){
        boolean result = false;
        Room room = (Room) o;
        int iRoom = search(room);

        if(iRoom != -1){
            rooms = (Room[]) lessInventory(rooms, iRoom);
            result = true;
        }
        return result;
    }
    public Object[] lessInventory(Object[] o, int iItem){
        Room[] oRooms = (Room[]) o;
        Room[] decreMemory = new Room[rooms.length-1];
        for(int i = 0; i < rooms.length; i++){
            if(i < iItem){ decreMemory[i] = oRooms[i];  //"Arrays.copyOf"
            }
            else if(i > iItem){ decreMemory[i-1] = oRooms[i];
            }
        }
        return decreMemory;
    }
    
    public void createInventory(){
        rooms[0] = new Room("Dormitorio",123, 2,"Inventario Dormitorio");
        rooms[1] = new Room("Patio",456, 1,"Inventario patio");
        
    }

    public String toString(){
        String output = "";
        for (int i=0; i < rooms.length; i++){
            output = output + rooms[i].toString() + "\n";
        }
        return output;
    }
}
