public class InventoryDevices implements Inventories{
    private String nameInventory;
    private Device[] devices;   //Para metodos practicos solo usaremos 6 devices = devices[6]

    public InventoryDevices(String nameInventory){
        this.nameInventory = nameInventory;
        int nDevices = 6;
        devices = new Device[nDevices]; //Estos datos los ingresaría el usuario con addInventory()
        createInventory();
    }

    public String getNameInventory(){return nameInventory;}
    public Device getDevice(int nDevice){return devices[nDevice];} //Dudoso
    
    public void setNameInventory(String nameInventory){this.nameInventory = nameInventory;}

    public int search(Object o){
        int index = -1;
        Device device = (Device) o;
        for (int i=0; i < devices.length; i++){
            if (devices[i].equals(device)){ index = i; break;
            }
        }
        return index;
    }
    
    public void add(Object o){
        Device device = (Device) o;
        devices = (Device[]) moreInventory(devices);
        devices[devices.length-1] = device;
    }
    public Object[] moreInventory(Object[] o){
        Device[] oDevices = (Device[]) o;
        Device[] incMemory = new Device[devices.length+1];
        for(int i = 0; i < devices.length; i++){
            incMemory[i] = oDevices[i];  //"Arrays.copyOf"
        }
        return incMemory;
    }
    
    public boolean remove(Object o){
        boolean result = false;
        Device device = (Device) o;
        int iDevice = search(device); //search((Device) o)
        
        if(iDevice != -1){
            devices = (Device[]) lessInventory(devices, iDevice);
            result = true;
        }
        return result;
    }
    public Object[] lessInventory(Object[] o, int iItem){
        Device[] oDevices = (Device[]) o;
        Device[] decreMemory = new Device[devices.length-1];

        for(int i = 0; i < devices.length; i++){
            if(i < iItem){ decreMemory[i] = oDevices[i];  //"Arrays.copyOf"
            }
            else if(i > iItem){ decreMemory[i-1]= oDevices[i];
            }
        }
        return decreMemory;
    }

    public void createInventory(){
        devices[0] = new Device(00, true, "AG", new DeviceSpecs(Brand.LG , "123", true, false));
        devices[1] = new Device(01, false, "AB", new DeviceSpecs(Brand.DAEWO , "456", true, false));
        devices[2] = new ACdevice(02, true, "AD", new DeviceSpecs(Brand.PANASONIC , "789", false, false), 10.23, 12);
        devices[3] = new ACdevice(03, true, "AG", new DeviceSpecs(Brand.LG , "123", true, false), 10.23, 12);
        devices[4] = new TVdevice(04, false, "AB", new DeviceSpecs(Brand.DAEWO , "456", true, false), 4, 11);
        devices[5] = new TVdevice(05, true, "AD", new DeviceSpecs(Brand.PANASONIC , "789", false, false), 4, 1);
    }

    public String toString() {
        String output = "";
        for (int i=0; i < devices.length; i++){
            output = output + "DISPOSITIVO[" + (i+1) + "]:\n" + devices[i].toString() + "\n";
        }      
        return output;
    }
}