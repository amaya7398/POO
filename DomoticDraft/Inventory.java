public class Inventory{
    private Device[] devices;   //Para metodos practicos solo usaremos 6 devices = devices[6]
    //static int numDevices;

    public Inventory(){
        int nDevices = 6;
        devices = new Device[nDevices]; //Estos datos los ingresaría el usuario con addInventory()
        devices[0] = new Device(00, true, "AG", new DeviceSpecs(Brand.LG , "123", true, false));
        devices[1] = new Device(01, false, "AB", new DeviceSpecs(Brand.DAEWO , "456", true, false));
        devices[2] = new ACdevice(02, true, "AD", new DeviceSpecs(Brand.PANASONIC , "789", false, false), 10.23, 12);
        devices[3] = new ACdevice(03, true, "AG", new DeviceSpecs(Brand.LG , "123", true, false), 10.23, 12);
        devices[4] = new TVdevice(04, false, "AB", new DeviceSpecs(Brand.DAEWO , "456", true, false), 4, 11);
        devices[5] = new TVdevice(05, true, "AD", new DeviceSpecs(Brand.PANASONIC , "789", false, false), 4, 1);
    }

    //public void addInventory(){}

    public Device getDevice(int nDevice){
        return devices[nDevice];
    }

    /*Busqueda por ID
    public int searchDevice(int id){
        int nDevices = devices.length;
        for (int i=0; i < nDevices; i++){
            if (devices[i] instanceof Device && devices[i].getId() == id){
                return i;
            }
        }
        return -1;
    }*/
    public int searchDevice(int nDevice){
        int nDevices = devices.length;
        int index = -1;
        
        for (int i=0; i < nDevices; i++){
            if (devices[i].equals(devices[nDevice])){
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean deviceRemove(int nDevice){
        boolean result = false;
        int iDevice = searchDevice(nDevice);
        if(iDevice != -1){
            reOrganizeDevices(iDevice);
            result = true;
        }
        return result;
    }
    
    public void reOrganizeDevices(int iDevice){

        for ( int i = iDevice; i < devices.length; i++){
            if (i < (devices.length-1) ){
                devices[i]= devices[i+1];
            } else {
                devices[i] = new Device(0, false, null, new DeviceSpecs(Brand.None, null, false, false));
            }
        }
    }

    public String toString() {
        String output = "";
        for (int i=0; i < devices.length; i++){
            output = output + "DISPOSITIVO[" + (i+1) + "]:\n" + devices[i].toString() + "\n";
        }      
        return output;
    }
}