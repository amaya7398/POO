//import sun.jvm.hotspot.ui.action.ShowAction;

public class Main{

    public static void main(String[] args) {
        
        Inventory inventario = new Inventory();
        /*
        System.out.println(inventario);
        inventario.deviceRemove(3);
        System.out.println(inventario);
        */

        //Cambiar valor, solo existe una matriz de 6 elementos (0-5)
        int searching4 = 3;
        int busqueda = inventario.searchDevice(searching4);

        if (busqueda != -1){
            System.out.println("Dispositivo existente, index = " + inventario.searchDevice(searching4) + "\n");
            System.out.println(inventario.getDevice(searching4));
        } else {
            System.out.println("Dispositivo no existe:\n");
        }
        
        //inventario.createInventory(); //Sin implementación, fue añadido manual
        //System.out.println(prueba);
        
    }
}
