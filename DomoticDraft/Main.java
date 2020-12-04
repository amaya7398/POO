
public class Main{

    public static void main(String[] args) {
        
        /*Room rum = new Room("Dormitorio", 123, 4, "Inventorio pa'mimir");
        System.out.println(rum);*/
        InventoryRooms zona1 = new InventoryRooms("Zona 1, Patio y dormitorio");
        System.out.println(zona1);
        
        Room zonaPrueba = new Room("Patio",789, 5,"Inventario Prueba");
        zona1.add(zonaPrueba);
        System.out.println(zona1);
        /*
        Inventories inventario = new InventoryDevices("Dispositivos AC, TV, Devices");
        System.out.println(inventario);

        System.out.println(inventario);     inventario.deviceRemove(3);  System.out.println(inventario);
        int busqueda = inventario.searchDevice(inventario.getDevice());
        if (busqueda != -1){
            System.out.println("Dispositivo existente, index = " + inventario.searchDevice($devices) + "\n");
            System.out.println(inventario.getDevice(searching4));
        } else {
            System.out.println("Dispositivo no existe:\n");
        }*/
    }
}
