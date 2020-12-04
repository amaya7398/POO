
public class Room {
    private String nameRoom;
    private int idRoom;
    private int floor;
    private InventoryDevices inventoryDevices;

    public Room(String nameRoom, int idRoom, int floor, String nameInventory){
        this.nameRoom = nameRoom;
        this.idRoom = idRoom;
        this.floor = floor;
        inventoryDevices = new InventoryDevices(nameInventory);
    }

    public String getNameRoom(){return nameRoom;}
    public int getIdRoom(){return idRoom;}
    public int getFloor(){return floor;}
    public InventoryDevices getInventoryDevices(){return inventoryDevices;}
    
    public void setNameRoom(String nameRoom){this.nameRoom = nameRoom;}
    public void setIdRoom(int idRoom){this.idRoom = idRoom;}
    public void setFloor(int floor){this.floor = floor;}
    //public void setInventoryDevices(String nameInventory){this.inventoryDevices = new InventoryDevices(nameInventory);}

    public String toString(){
        String output = "";
        output = "$$[ID Room]: " + this.idRoom + "\n" +
                "[Name Room]: " + this.nameRoom + "\n" +
                "[Floor]: " + this.floor + "\n\n" +
                inventoryDevices.toString() + "$$\n";
        return output;
    }

}
