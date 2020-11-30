public class ACdevice extends Device {
    private Double temperature;
    private int voltage;

    public ACdevice(int id, Boolean status, String name, DeviceSpecs deviceSpecs, Double temperature, int voltage){
        super(id, status, name, deviceSpecs);
        this.temperature = temperature;
        this.voltage = voltage;
    }

    public void setTemperature(Double temperature){
        this.temperature = temperature; 
    }

    public double getTemperature(){
        return temperature; 
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if(o instanceof ACdevice) {
            ACdevice device = (ACdevice) o;
            if(temperature == device.temperature &&
            voltage == device.voltage &&
            super.equals(device)) {
                result = true;
            }
        }
        return result;
    }
    
    @Override
    public String toString(){
        String output = "";
        output = super.toString() +
                "Temperatura: " + this.temperature + "\n" +
                "Voltaje: " + this.voltage + "\n";
        return output;
    }
}
