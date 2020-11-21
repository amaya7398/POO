public class Device {
    private int id;
    private boolean status;
    private String name;
    private DeviceSpecs deviceSpecs;
    
    public Device() {
        this.id = 0;
        this.status = false;
        this.name = null;
        this.deviceSpecs = null;
    }

    public Device(int id, boolean status, String name, DeviceSpecs deviceSpecs) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.deviceSpecs = deviceSpecs;
    }

    //======GETS
    public int getId() {
        return id;
    }
    public boolean getStatus(){
        return status;
    }
    public String getName(){
        return name;
    }
    public DeviceSpecs getdeviceSpecs(){
        return deviceSpecs;
    }
    
    //======SETS
    public void setId(int id){
        this.id = id;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setdeviceSpecs(DeviceSpecs deviceSpecs){
        this.deviceSpecs = deviceSpecs;
    }
    

    public String toString(){
        String output;
        output = "ID: " + this.id +"\n" +
                "Status: " + this.status + "\n"+
                "Name: " + this.name + "\n" +
                deviceSpecs.toString();
                
        return output;
    }
  
}    