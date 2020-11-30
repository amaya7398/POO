public class TVdevice extends Device {
    private int portsUSB;
    private int hourMax;

    public TVdevice(int id, Boolean status, String name, DeviceSpecs deviceSpecs, int portsUSB, int hourMax){
        super(id, status, name, deviceSpecs);
        this.portsUSB = portsUSB;
        this.hourMax = hourMax;
    }

    public void setPortsUSB(int portsUSB) {
        this.portsUSB = portsUSB;
    }
    public void setHourMax(int hourMax){
        this.hourMax = hourMax;
    }

    public int getPortUSB() {
        return portsUSB;
    }
    public int getHourMax() {
        return hourMax;
    }

    @Override
    public boolean equals(Object o){
        boolean result = false;
        if(o instanceof TVdevice){
            TVdevice device = (TVdevice) o;
            
            if (super.equals(device) &&
            portsUSB == device.portsUSB &&
            hourMax == device.hourMax){
                result = true;
            } 
        }
        return result;
    }

    @Override
    public String toString(){
        String output = ""; 
        output = super.toString() +
            "Puertos USB: " + this.portsUSB + "\n" +
            "Hora Máxima de uso: " + this.hourMax + "\n";
        return output;
    }
}