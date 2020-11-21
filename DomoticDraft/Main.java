//import sun.jvm.hotspot.ui.action.ShowAction;

public class Main{

    public static void main(String[] args) {
        
        Inventory inventario = new Inventory(6);
    
        System.out.println(inventario);
        inventario.deviceRemove(3);
        System.out.println(inventario);

        int n2search = 1; //Cambiar valor, solo existe una matriz de 6 elementos (0-5)
        int busqueda = inventario.searchDevice( n2search );

        if (busqueda != -1){
            System.out.println("Dispositivo existente: " + inventario.searchDevice(2) + "\n\n");
            //inventario.device
        } else {
            System.out.println("Dispositivo no existe:\n\n");
        }

        
        //inventario.createInventory(); //Sin implementación, fue añadido manual
        //Device prueba = new Device(4, true, "AG", new DeviceSpecs(Brand.LG , "123", true, false));
        //System.out.println(prueba);
        
    }
}
