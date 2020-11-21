public class DeviceSpecs{
    protected Brand brand;
    protected String model;
    protected boolean wifiBuiltIn;
    protected boolean bluetoothwifiBuiltIn; 

    public DeviceSpecs(){
        this.brand = null;
        this.model = null;
        this.wifiBuiltIn = false;
        this.bluetoothwifiBuiltIn = false;
    }

    public DeviceSpecs(Brand brand, String model, Boolean wifiBuiltIn, Boolean bluetoothwifiBuiltIn){
        this.brand = brand;
        this.model = model;
        this.wifiBuiltIn = wifiBuiltIn;
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }

    //======GETS
    public Brand getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public boolean getWifiBuiltIn(){
        return wifiBuiltIn;
    }
    public boolean getBluetoothwifiBuiltIn(){
        return bluetoothwifiBuiltIn;
    }
    
    //======SETS
    public void setBrand(Brand brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setWifiBuiltIn(Boolean wifiBuiltIn){
        this.wifiBuiltIn = wifiBuiltIn;
    }
    public void setBluetoothwifiBuiltIn(Boolean bluetoothwifiBuiltIn){
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }

    public String toString(){

        String salida = null;
        salida = "Brand: " + this.brand.getBrandName() + "\n" +
                 "Model: " + this.model + "\n" +
                 "Wifi: " + this.wifiBuiltIn + "\n" +
                 "Bluetooth: " + this.bluetoothwifiBuiltIn + "\n";
        return salida;
    } 
}