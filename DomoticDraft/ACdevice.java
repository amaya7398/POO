public class ACdevice extends Device {
    private Double temp;
    private int voltage;

    public ACdevice(int id, Boolean status, String name, DeviceSpecs deviceSpecs, Double temp, int voltage){
        super(id, status, name, deviceSpecs);
        this.temp = temp;
        this.voltage = voltage;
    }
    
    @Override
    public String toString(){
        String output = "";
        output = super.toString() +
                "Temperatura: " + this.temp + "\n" +
                "Voltaje: " + this.voltage + "\n";
        return output;
    }
}
